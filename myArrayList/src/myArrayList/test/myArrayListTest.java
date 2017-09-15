package myArrayList.test;
import myArrayList.MyArrayList;
import myArrayList.util.Results;



public class MyArrayListTest {

	
	public void testMe(MyArrayList myArrayList, Results results){
		
		
		
		print_sum(myArrayList, results);
		
		results.writeToFile("\n");
		
		test_resize(myArrayList, results);
		
		test_insertSorted(myArrayList, results);
		
		test_duplicate_value_addition(myArrayList, results);
		
		test_removeSorted(myArrayList, results);
		
		test_size(myArrayList, results);
		
		test_index_of(myArrayList, results);
		
		test_index_not_found(myArrayList, results);
		
		test_sum(myArrayList, results);
		
		test_remove_all_occurence(myArrayList, results);
		
		test_check_boundry(myArrayList, results);
		
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
		
		
		
	  void print_sum(MyArrayList myArrayList, Results results){
		  
		  
		  results.storeNewResult("Sum of the member of Array List = "+myArrayList.sum());
		  
		  
		  
		  
	  }
	
	  void test_index_of(MyArrayList myArrayList, Results results){
		  
		  
		  int size = myArrayList.size();
		  myArrayList.insertSorted(0);
		 // myArrayList.insertSorted(101);
		  //myArrayList.insertSorted(99);
		  
		  int index = myArrayList.indexOf(0);
		  
		  if(0 == index ){
			  
			  
			  results.storeNewResult("Test to Find Index of Element Passed...");
			  
		  }else{
			  
			  
			  results.storeNewResult("Test to find Index of Element Failed ---> Error !!Wrong Index");
		  }
		  
		  
		  
		  
	  }
	
	void test_resize(MyArrayList myArrayList, Results results){
		
		
		int initial_size = 50;
		for(int i = 0;i<50;i++){
			
			myArrayList.insertSorted(6);
		}
		
		if(myArrayList.size() > initial_size){
			
			
			results.storeNewResult("Test of resize Array Passed...");
			
			
			
			
			
		}else{
			
			
			results.storeNewResult("Test of resize Array Failed ---> Error!! Can not resize, Array Index out of bound.");
		}
		
		
		
		
		
	}
	
	void test_sum(MyArrayList myArrayList, Results results){
		
		
		int old_sum = myArrayList.sum();
		myArrayList.insertSorted(4);
		int new_sum = myArrayList.sum();
		
		if((old_sum + 4) == new_sum){
			
			results.storeNewResult("Test of Sum of Array List Elements Passed...");
			
		}else{
			
			results.storeNewResult("Test of Sum of Array List Elements Failed ---> Error Wrong sum");
			
		}
	}
	
	void test_remove_all_occurence(MyArrayList myArrayList, Results results){
		
		
		myArrayList.insertSorted(5);
		myArrayList.removeValue(5);
		
		if(myArrayList.indexOf(5) == -1){
			
			
			results.storeNewResult("Test of Removal of all the occurence of Element from Array List Passed...");
			
		}else{
			
			
			results.storeNewResult("Test of Removal of all the occurence of Element from Array List failed ---> Can not Remove all the Occurence");
			
		}
	}
	
	void test_duplicate_value_addition(MyArrayList myArrayList,Results results){
		
		myArrayList.insertSorted(55);
		int index = myArrayList.indexOf(55);
		int size = myArrayList.size();
		myArrayList.insertSorted(55);
		int index_after = myArrayList.indexOf(55);
		int size_after = myArrayList.size();
		
		if((index == index_after) && (size_after == size + 1)){
			
			results.storeNewResult("Test of duplicate value addition Passed...value added after");
			
		}else{
			
			results.storeNewResult("Test of duplicate value addition Failed ---> Error !!! can not add value");
			
		}
		
	}
	
	void test_index_not_found(MyArrayList myArrayList, Results results){
		
		myArrayList.insertSorted(11);
		myArrayList.removeValue(11);
		
		int return_index = myArrayList.indexOf(11);
		
		if(return_index == -1){
			
			results.storeNewResult("Test of Finding index of non present value Passed...");
			
			
		}else{
			
			results.storeNewResult("Test of Finding index of non present value Failed...not returning -1");
			
		}
		
		
	}
	
	void test_check_boundry(MyArrayList myArrayList, Results results){
		
		int size = myArrayList.size();
		for (int i = 0; i < 1000; i++) {
			
			myArrayList.insertSorted(i);
		}
		
		int size_after = myArrayList.size();
		if(size + 1000 == size_after){
			
			results.storeNewResult("Test of Checking Boundry is Passed... Added Maximum number of values");
		}else{
			
			
			results.storeNewResult("Test of Checking Boundry Failed!!! ---> Can not store too many values");
		}
		
		
		
	}
	
}
