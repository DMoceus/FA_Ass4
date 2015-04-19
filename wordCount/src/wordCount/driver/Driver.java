package wordCount.driver;
import java.util.TreeMap;
import wordCount.treesForStrings.StringWrapper;
import wordCount.treesForStrings.WordSizeNode;
import wordCount.visitors.WordCountVisitor;
import wordCount.visitors.Visitor;

public class Driver{
	public static final int NUM_ITERATIONS = 1;

	public static void main(String args[]){
		//Command Line Input
		//Start Timing
		long startTime = System.currentTimeMillis();
		for(int i=0;i<NUM_ITERATIONS;i++){
			TreeMap<String,WordSizeNode> wordTree = new TreeMap<String,WordSizeNode>();
			Visitor wordCountVisitor = new WordCountVisitor();
			//Make File Accessors
			//Read Data
			//Build Tree
			//Iterate Tree
			for(String key : wordTree.keySet()){
				(wordTree.get(key)).accept(wordCountVisitor);
			}
		}
		//End Timer
		long finishTime = System.currentTimeMillis();
		long totalTime = (finishTime - startTime) / NUM_ITERATIONS;
		System.out.println("Total Time: " + totalTime);
		//Print Output
	}
}
