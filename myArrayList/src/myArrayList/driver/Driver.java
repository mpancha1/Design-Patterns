package myArrayList.driver;
import myArrayList.MyArrayList;
import myArrayList.util.Results;
import myArrayList.test.MyArrayListTest;
public class Driver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MyArrayList m = new MyArrayList(args[0]);
		Results r = new Results(args[1]);
		MyArrayListTest mt = new MyArrayListTest();
		mt.testMe(m, r);
		
	}

}
