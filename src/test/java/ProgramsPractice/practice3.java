package ProgramsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		
		int[] a1 = {4,5,6,7,8};
		int[] a2={4,5,6,7,8,8};
		int sum=0;
		
		//boolean status= Arrays.equals(a1, a2);
		
		
		boolean status=true;
		
		
		  if(a1.length==a2.length) {
		  
			  for(int i=0;i<a1.length;i++) { 
				  if(a1[i]!=a2[i]) {
					  status=false;
				  }
			  
			  }
		  }else {
			  status=false;
		  }
		  
		 
		if(status==true) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Both arrays are not equal");
		}
		  }	  
}
