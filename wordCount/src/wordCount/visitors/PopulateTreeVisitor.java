package wordCount.visitors;

import java.util.TreeMap;
import wordCount.treesForStrings.WordSizeNode;
import wordCount.treesForStrings.StringWrapper;

public class PopulateTreeVisitor implements Visitor{
	public TreeMap<String,WordSizeNode> tree;

	public PopulateTreeVisitor(TreeMap<String,WordSizeNode> treeIn){
		tree = treeIn;
	}

	public void visit(WordSizeNode o){}

	//read words from a file and populate the tree
	public void visit(StringWrapper o){
		//take the string and store it in the tree map
		String s = o.getString();
		if (tree.containsKey(s)){
			(tree.get(s)).incrementCount();
		} else{
			WordSizeNode wsn = new WordSizeNode(s);
			tree.put(s, wsn);
		}
	}
}
