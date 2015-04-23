package wordCount.treesForStrings;
import wordCount.visitors.Visitor;
import wordCount.util.MyLogger;

public class WordSizeNode{
	private int wordSize;
	private int wordCount;
	MyLogger logger;
	
	public WordSizeNode(String wordIn){
		wordSize = wordIn.length();
		wordCount = 1;
		logger = MyLogger.getInstance();
		logger.printMessage(1);
	}

	public int getWordSize(){
		return wordSize;
	}
	
	public int getWordCount(){
		return wordCount;
	}

	public void incrementCount(){
		wordCount++;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
}
