package myArrayList.driver;
import myArrayList.MyArrayList;
import myArrayList.util.Results;
import myArrayList.test.MyArrayListTest;
public class Driver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(args[1]);
		MyArrayList m = new MyArrayList(args[0]);
		Results r = new Results(args[1]);
		MyArrayListTest mt = new MyArrayListTest();
		mt.testMe(m, r);
		
		/*MyArrayList m = new MyArrayList();
		m.insertSorted(5);
		m.insertSorted(10);
		m.insertSorted(11);
		m.insertSorted(12);
		//m.removeValue(91);
		m.toString();
		m.removeValue(5);
		m.toString();*/
		
		
		
		
		
		
	}

}
