package p;

import java.util.Arrays;

public class Paper {

		  
	public static void main (String[] args) {
		
		int[] list= {1,35,53,90,5};
		int a=bigDiff(list);
		
		System.out.println(a);
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

}
