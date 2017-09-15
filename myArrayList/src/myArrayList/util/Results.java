package myArrayList.util;

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
		
		System.out.println(s+"\n");
	}
	
	public Results(String file_path_C){
		
		results = new String[11];
		file_path = file_path_C;
		File file = new File(file_path);
		
		
		try {
			file.createNewFile();
			bw = new BufferedWriter(new FileWriter(file_path));
			bw.write("");
		} catch (IOException e) {
			
			System.err.println("Exception Can not Create File or Can not write in ti file!! ");
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
		
		bw.close();
		super.finalize();
	}

	@Override
	public void writeToFile(String s) {
		
		
		
		
		try {

			
			bw = new BufferedWriter(new FileWriter(file_path,true));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
			
			try {
				
				bw.append(s);
				bw.newLine();
				
			} catch (IOException e) {
				
			
				System.err.println("Can not Write in to file");
				e.printStackTrace();
				
			}try {
				finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
		
		
	}
	

}

