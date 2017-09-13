import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {

	private int initial_size = 50;
	private int track_insert = 0;

	private int Array_Fill[] = new int[initial_size];

	public MyArrayList(int input[]) {

		int Array_Fill_new[];
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

		}
	}

	public String toString() {

		for (int i = 0; i < track_insert; i++) {
			System.out.println(Array_Fill[i]);
		}
		return null;
	}

	public void insertSorted(int value) {

		Array_Fill[track_insert] = value;
		track_insert++;
		Arrays.sort(Array_Fill, 0, track_insert);

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
	/*
	 * public static void main(String[] args) {
	 * 
	 * int[] test_arr = new int[10];
	 * 
	 * MyArrayList m = new MyArrayList(test_arr);
	 * 
	 * m.insertSorted(7); m.insertSorted(5); m.insertSorted(5);
	 * m.insertSorted(5); m.insertSorted(-1); m.insertSorted(0);
	 * m.removeValue(5); System.out.println("Index of Searched Value : "+
	 * m.indexOf(5)); System.out.println("\nSum of ArrayList : "+ m.sum());
	 * m.insertSorted(10); System.out.println("\nSize of ArrayList : "+
	 * m.size()); System.out.println("\nSum of ArrayList : "+ m.sum());
	 * 
	 * m.toString();
	 * 
	 * }
	 */
}
