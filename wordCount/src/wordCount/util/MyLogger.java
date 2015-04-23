package wordCount.util;

public class MyLogger{
	private static MyLogger instance = null;
	private static final int DEFAULT = 0;
	private static final int CONSTRUCTOR = 1;
	private static final int ONVISIT = 2;
	private static int DEBUG = 0;
	
	protected MyLogger(){}
	public void setDebug(int value){
		if((value >= DEFAULT) && (value <= ONVISIT)){
			DEBUG = value;
		}
	}
	
	public static MyLogger getInstance(){
		if(instance == null){
			instance = new MyLogger();
		}
		return instance;
	}
	/*
	public boolean showsSomething(){
		return (DEBUG != NOTHING);
	}
	*/
	public void printMessage(int value){
		if(DEBUG == value){
			if(CONSTRUCTOR == DEBUG){
				System.out.println("Constructor Called");
			}
			else if(ONVISIT == DEBUG){
				System.out.println("Visit Function Called");
			}
		}
	}
}
