package wordCount.driver;

import java.util.TreeMap;
import java.lang.NumberFormatException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import wordCount.treesForStrings.StringWrapper;
import wordCount.treesForStrings.WordSizeNode;
import wordCount.visitors.WordCountVisitor;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.Visitor;
import wordCount.util.FileProcessor;

public class Driver{

	public static void main(String args[]){
		//Command Line Input
		String inName = args[0];
		String outName = args[1];

		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(outName));
			bw.flush();
			bw.close();
		} catch (IOException e){
			System.out.println("Error in Driver: IOException while flushing output file.");
		}

		FileProcessor processor;
		StringWrapper stringIn;
		int iterations = 1;
		int debug = 0;
		try{
			iterations = Integer.parseInt(args[2]);
			debug = Integer.parseInt(args[3]);
		}
		catch(NumberFormatException e){
			System.err.println("Iterations or Debug not ints, reverting to defaults");
			iterations = 1;
			debug = 0;
		}
		
		//Start Timing
		long startTime = System.currentTimeMillis();
		for(int i=0;i<iterations;i++){
			TreeMap<String,WordSizeNode> wordTree = new TreeMap<String,WordSizeNode>();
			Visitor wordCountVisitor = new WordCountVisitor();
			Visitor populateTreeVisitor = new PopulateTreeVisitor(wordTree);
			//Make File Accessors
			processor = new FileProcessor(inName,outName);
			//Read Data
			//Build Tree
			while(processor.hasNextFromFile()){
				stringIn = new StringWrapper(processor.getNextFromFile());
				stringIn.accept(populateTreeVisitor);
			}
			//Iterate Tree
			for(String key : wordTree.keySet()){
				(wordTree.get(key)).accept(wordCountVisitor);
			}
		}
		//End Timer
		long finishTime = System.currentTimeMillis();
		long totalTime = (finishTime - startTime) / iterations;
		System.out.println("Total Time: " + totalTime);
		//Print Output
	}
}
