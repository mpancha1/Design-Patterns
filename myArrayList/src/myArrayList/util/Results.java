import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Results implements StdoutDisplayInterface,FileDisplayInterface {
   
	private String[] results;
	private int i;
	private  String file_path;
	BufferedWriter bw;
	@Override
	public void writeToStdout(String s) {
		// TODO Auto-generated method stub
		System.out.println(s+"\n");
	}
	
	public Results(){
		
		results = new String[10];
		file_path = "C:\\Users\\MANAV\\Desktop\\Fall 2017\\DP\\Assignments\\Assignment_1\\output_assi1.txt";
		File file = new File(file_path);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i = 0;
		
	}
	
	public void storeNewResult(String s){
		
		
		results[i] = s;
		writeToFile(results[i]);
		i++;
		
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		bw.close();
		super.finalize();
	}

	@Override
	public void writeToFile(String s) {
		// TODO Auto-generated method stub
		
		//File file = new File("C:\\Users\\MANAV\\Desktop\\Fall 2017\\DP\\Assignments\\Assignment_1\\output_assi1.txt");
		
		try {
			bw = new BufferedWriter(new FileWriter(file_path,true));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
			try {
				
				bw.append(s);
				bw.newLine();
				//bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}try {
				finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
		
		
	}
	
public static void main(String[] args) {
	
	FileDisplayInterface f = new Results();
	f.writeToFile("Hello");
	f.writeToFile("hellooooo");
	//f.writeToFile("Hello0\n");
	
}
}

