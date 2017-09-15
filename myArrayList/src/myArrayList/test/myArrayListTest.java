
public class MyArrayListTest {

	
	void testMe(MyArrayList myArrayList, Results results){
		
		
		
		test_insertSorted(myArrayList, results);
		
		test_removeSorted(myArrayList, results);
		
		test_size(myArrayList, results);
		
		
		
	}
	
	void test_insertSorted(MyArrayList myArrayList, Results results){
		
		int before_sum = myArrayList.sum();
		myArrayList.insertSorted(10);
		int after_sum = myArrayList.sum();
		
		

		   
		
		
		if((after_sum - before_sum == 10)){
			
			results.storeNewResult("test InsertSorted Method Passed...");
			
		}else{
			
			results.storeNewResult("test InsertSorted Method ----> Error!! Can not insert value, Array Index out of bound");
			
		}
	}

	void test_removeSorted(MyArrayList myArrayList, Results results){
		
		
		int before_sum = myArrayList.sum();
		myArrayList.removeValue(10);
		int after_sum = myArrayList.sum();
		
if((after_sum - before_sum == -10)){
			
			results.storeNewResult("test RemoveSorted Method Passed...");
			
		}else{
			
			results.storeNewResult("test RemoveDorted Method Failed ----> Error!! Removing value, Can not find Value...");
			
		}
	}
		
		
		void test_size(MyArrayList myArrayList, Results results){
			
			int size_before = myArrayList.size();
			myArrayList.insertSorted(50);
			int size_after = myArrayList.size();
			
			if(size_before + 1 == size_after){
				
				results.storeNewResult("test Size check Passed...");
			}else{
				
				
				results.storeNewResult("test Size check Failed...---> Error Wrong Size!!!!");
			}
		}
		
		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		MyArrayList m = new MyArrayList();
		Results r = new Results();
		MyArrayListTest mt = new MyArrayListTest();
		mt.testMe(m, r);
	
		
	}
	
}
