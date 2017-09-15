package myArrayList;
import myArrayList.util.FileProcessor;
import java.util.Arrays;


public class MyArrayList {

	private int initial_size = 50;
	private int track_insert = 0; //Keep Tracking the number of elements stored in MyArrayList

	private int Array_Fill[] = new int[initial_size];

	public MyArrayList(String file_name) {
// Creating FileProcessor instance to read the file and store it in ArrayList.
		
		FileProcessor fp = new FileProcessor(file_name);
		String line;
		int countinput  = 0;
		while((line = fp.readLine())!= null){
			countinput++;
			
			if(countinput <= Array_Fill.length){

if((Integer.parseInt(line) > 0) && (Integer.parseInt(line) < 10000)){
			insertSorted(Integer.parseInt(line));
				}

			
			}else{
				
				reSizeArray(Array_Fill);
if((Integer.parseInt(line) > 0) && (Integer.parseInt(line) < 10000)){
			insertSorted(Integer.parseInt(line));
				}
				
			}
		}
		
	}
	


/**------------------------------------- Method to ReSIZE the Array returning nothing-------------------------------------------------------------*/
	private void reSizeArray(int input[]){
		int Array_Fill_new[];
		
		int count = initial_size;
		initial_size = initial_size + (initial_size >> 1);
		Array_Fill_new = new int[initial_size];

		for (int i = 0; i < count; i++) {

			Array_Fill_new[i] = Array_Fill[i]; //Coping old Array to New Array

		}
		Array_Fill = Array_Fill_new;  
		
		for (int i = 0; i < input.length; i++) {
			Array_Fill[i] = input[i];
			

		}
		
		
		
	}

	public String toString() {

		
		for (int i = 0; i < track_insert; i++) {
			System.out.println(Array_Fill[i]);
		}
		return null;
	}


	/**------------------------------------- Method to Insert in to the Array returning nothing-------------------------------------------------------------*/

	public void insertSorted(int value) {
         
		if(track_insert < Array_Fill.length){
		Array_Fill[track_insert] = value;
		track_insert++;
		
		Arrays.sort(Array_Fill, 0, track_insert);
		//System.out.println(track_insert);
		}
		else{
		
			reSizeArray(Array_Fill);
			Array_Fill[track_insert] = value;
			track_insert++;
			
			Arrays.sort(Array_Fill, 0, track_insert);
			
		}
	}

	/**------------------------------------- Method to Return the index of the the MyArrayList Element if found return index else return -1  -------------------------------------------------------------*/

	public int indexOf(int value) {

		int indexof = -1;

		for (int i = 0; i < Array_Fill.length; i++) {

			if (Array_Fill[i] == value) {

				indexof = i;
				// System.out.println(indexof);
				break;
			}

		}

		return indexof;

	}

	/**------------------------------------- Method to get the size of MyArrayList returning int -------------------------------------------------------------*/

	public int size() {

		return track_insert;

	}

	/**------------------------------------- Method to return sum of Elements of MyArray returnng sum int -------------------------------------------------------------*/

	public int sum() {

		int sumofelement = 0;

		for (int i = 0; i < track_insert; i++) {

			sumofelement += Array_Fill[i];
		}

		return sumofelement;
	}


/*------------------------------------- Method to Remove Element from  MyArrayList -------------------------------------------------------------*/

	public int removeValue(int value) {
		int i;
		for (i = 0; i < Array_Fill.length; i++) {

			if (Array_Fill[i] == value) {
				
				for (int j = i; j < Array_Fill.length - 1; j++) {

					Array_Fill[j] = Array_Fill[j + 1];

				}

				i--;
				track_insert--;
				
			}

		}

		return 0;
	}
	
}
