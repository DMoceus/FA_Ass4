package wordCount.treesForStrings;

import wordCount.visitors.Visitor;
import wordCount.util.MyLogger;

public class StringWrapper{
	MyLogger logger;
	public String string;

	public StringWrapper(String str){
		string = str;
		logger = MyLogger.getInstance();
		logger.printMessage(1);
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
