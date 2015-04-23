package wordCount.visitors;
import wordCount.visitors.Visitor;
import wordCount.treesForStrings.WordSizeNode;
import wordCount.treesForStrings.StringWrapper;
import wordCount.util.MyLogger;

public class WordCountVisitor implements Visitor{
	private int uniqueWords;
	private int wordCount;
	private int characterCount;
	MyLogger logger;
		
	public WordCountVisitor(){
		uniqueWords = 0;
		wordCount = 0;
		characterCount = 0;
		logger = MyLogger.getInstance();
		logger.printMessage(1);
	}
	public void visit(WordSizeNode o){
		logger.printMessage(2);
		uniqueWords++;
		wordCount += o.getWordCount();
		characterCount += (o.getWordCount() * o.getWordSize());
	}
	
	public void visit(StringWrapper o){}
	
	public int getUniqueWords(){
		return uniqueWords;
	}
	public int getWordCount(){
		return wordCount;
	}
	public int getCharacterCount(){
		return characterCount;
	}
}
