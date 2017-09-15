package myArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {

	private int initial_size = 5;
	private int track_insert = 0;

	private int Array_Fill[] = new int[initial_size];

	public MyArrayList(String file_name) {

		
		
		
		
		
		
		/*int Array_Fill_new[];
		while (initial_size < input.length) {

			int count = initial_size;
			initial_size = initial_size + (initial_size >> 1);
			Array_Fill_new = new int[initial_size];

			for (int i = 0; i < count; i++) {

				Array_Fill_new[i] = Array_Fill[i];

			}
			Array_Fill = Array_Fill_new;
		}

		for (int i = 0; i < input.length; i++) {
			Array_Fill[i] = input[i];
			// System.out.println(Array_Fill[i]);

		}*/
		
		FileProcessor fp = new FileProcessor(file_name);
		String line;
		int countinput  = 0;
		while((line = fp.readLine())!= null){
			countinput++;
			
			if(countinput <= Array_Fill.length){
			insertSorted(Integer.parseInt(line));
			
			}else{
				
				reSizeArray(Array_Fill);
				insertSorted(Integer.parseInt(line));
				
			}
		}
		
	}
	
	private void reSizeArray(int input[]){
		int Array_Fill_new[];
		
		int count = initial_size;
		initial_size = initial_size + (initial_size >> 1);
		Array_Fill_new = new int[initial_size];

		for (int i = 0; i < count; i++) {

			Array_Fill_new[i] = Array_Fill[i];

		}
		Array_Fill = Array_Fill_new;
		
		for (int i = 0; i < input.length; i++) {
			Array_Fill[i] = input[i];
			// System.out.println(Array_Fill[i]);

		}
		
		
		
	}

	public String toString() {

		System.out.println("Length : " + Array_Fill.length);
		for (int i = 0; i < track_insert; i++) {
			System.out.println(Array_Fill[i]);
		}
		return null;
	}

	public void insertSorted(int value) {
         
		if(track_insert < Array_Fill.length){
		Array_Fill[track_insert] = value;
		track_insert++;
		
		Arrays.sort(Array_Fill, 0, track_insert);
		System.out.println(track_insert);
		}
		else{
			System.out.println("$--");
			reSizeArray(Array_Fill);
			Array_Fill[track_insert] = value;
			track_insert++;
			
			Arrays.sort(Array_Fill, 0, track_insert);
			
		}
	}

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

	public int size() {

		return track_insert;

	}

	public int sum() {

		int sumofelement = 0;

		for (int i = 0; i < track_insert; i++) {

			sumofelement += Array_Fill[i];
		}

		return sumofelement;
	}

	public int removeValue(int value) {
		int i;
		for (i = 0; i < Array_Fill.length; i++) {

			if (Array_Fill[i] == value) {
				System.out.println("----" + Array_Fill[i]);
				for (int j = i; j < Array_Fill.length - 1; j++) {

					Array_Fill[j] = Array_Fill[j + 1];

				}

				i--;
				track_insert--;
				// System.out.println("Track ; "+track_insert);
			}

		}

		return 0;
	}
	
}
