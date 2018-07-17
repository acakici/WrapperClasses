package ArrayList;

import java.util.ArrayList;

public class CreatingArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> lst= new ArrayList<>();
		
	lst.add("Ali");
	lst.add("Mehmet");	
	lst.add("Ahmet");
	lst.add("Celil");
	//if you print out object directly, compiler will add <> method imlicity 	
	System.out.println(lst);
	
	System.out.println(lst.get(0));
	
	for(int i=0; i<lst.size(); i++) {   //size is a method you need to have parantases 
		
		System.out.println(lst.get(i));
	}
	
	for(String each : lst) {
		
		System.out.print(each);
	}
	
	ArrayList<Integer> lst2= new ArrayList<Integer>();

	Integer num1 = new Integer(2);
	
	lst2.add(num1);
	lst2.add(123);
	lst2.add(13);
	lst2.add(23);		
	lst2.add(1223);	
	
	
	lst2.add(0, 1000);
	
	lst2.clear();    //if you use this, it will delete printed array list items. (inside of array list) 
	
	System.out.println(lst2);
	
	
	
	
	
	}

}
