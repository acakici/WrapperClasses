package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Paper {

		  
	public static void main (String[] args) {
		
		int[] list= {1,35,53,90,5};
		int a=bigDiff(list);
		
		System.out.println(a);
		
		List<> ls= new ArrayList<>();
		
		ls.add(list);
		
		
		
	}
	public static int bigDiff(int[] nums) {
		
		 int max= 0;
		 int min= nums[0]; 
		 
//		  for(int i=0; i<nums.length; i++){
//		    
//		    if(nums[i]>max){
//		    
//		    max= nums[i];
//		    
//		  }else if(nums[i]<min){
//		  
//		       min=nums[i]; 
//		  }
//		  }
//		  return max-min;
		  
		 
		 for(int i=0; i<nums.length; i++) {
			
		 max=Math.max(nums[i],max);
		 min= Math.min(nums[i],min);
		
		 }
		 
	return max-min;
		}

	public static int getDiff(int[] a) {
		
		List<Integer> ls= new ArrayList<>();
		
		for(int each: a) {
		
		ls.add(each);
			
		}
		
		Collections.sort(ls);
		return ls.get(ls.size()-1)-ls.get(0);
	}
	
	
}
