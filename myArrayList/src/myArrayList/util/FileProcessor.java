import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {

	BufferedReader br;
	FileReader in;
	public FileProcessor(String file_name){
		
		try {
			in = new FileReader(file_name);
			br = new BufferedReader(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		
	}
	
	public String readLine(){
		String line = null;
		
		try {
			line = br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return line;
	}
	
	
	
public static void main(String args[]){
	
	
	
	
	
	
}		 
  
}

