package wordCount.util;

public class MyLogger{
	private static MyLogger instance = null;
	private static final int NOTHING = 0;
	private static final int ONLYOUTPUT = 1;
	private static final int FILEWRITE = 2;
	private static final int NEWTAB = 3;
	private static final int REGISTEROBSERVER = 4;
	private static int DEBUG = 0;
	
	protected MyLogger(){}
	public void setDebug(int value){
		if((value >= NOTHING) && (value <= REGISTEROBSERVER)){
			DEBUG = value;
		}
	}
	
	public static MyLogger getInstance(){
		if(instance == null){
			instance = new MyLogger();
		}
		return instance;
	}
	
	public boolean showsSomething(){
		return (DEBUG != NOTHING);
	}
	
	public void printMessage(int value){
		if(DEBUG == value){
			if(FILEWRITE == DEBUG){
				System.out.println("File Wrote");
			}
			else if(NEWTAB == DEBUG){
				System.out.println("New Tab");
			}
			else if(REGISTEROBSERVER == DEBUG){
				System.out.println("Observer Registered");
			}
		}
	}
}
