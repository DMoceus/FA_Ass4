package wordCount.visitors;

import java.util.TreeMap;
import wordCount.treesForStrings.WordSizeNode;

public class PopulateTreeVisitor implements Visitor{
	public TreeMap<String,WordSizeNode> tree;

	public PopulateTreeVisitor(TreeMap<String,WordSizeNode> treeIn){
		tree = treeIn;
	}

	//read words from a file and populate the tree
	public void visit(){
		
	}
}
