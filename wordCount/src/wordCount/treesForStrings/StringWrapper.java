package wordCount.treesForStrings;

import wordCount.visitors.Visitor;

public class StringWrapper{
	public String string;

	public StringWrapper(String str){
		string = str;
	}

	public String getString(){
		return string;
	}

	public void setString(String input){
		string = input;
	}

	public void accept(Visitor v){
		v.visit(this);
	}
}