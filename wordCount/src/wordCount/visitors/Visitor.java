package wordCount.visitors;
import wordCount.treesForStrings.WordSizeNode;
import wordCount.treesForStrings.StringWrapper;

public interface Visitor{
	public void visit(StringWrapper o);
	public void visit(WordSizeNode o);
}
