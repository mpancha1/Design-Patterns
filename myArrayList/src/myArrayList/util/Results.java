
public class Results implements StdoutDisplayInterface,FileDisplayInterface {
   
	private String[] results;
	private int i;
	@Override
	public void writeToStdout(String s) {
		// TODO Auto-generated method stub
		System.out.println(s+"\n");
	}
	
	public Results(){
		
		results = new String[10];
		i = 0;
		
	}
	
	public void storeNewResult(String s){
		
		
		results[i] = s;
		i++;
		
		
	}

	@Override
	public void writeToFile(String s) {
		// TODO Auto-generated method stub
		
	}
	

}
