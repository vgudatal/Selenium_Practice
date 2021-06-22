package ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {

	Integer a[] = {5,1,9,2,3,47};
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp;
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]<a[j+1]) {
				int temp;
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println(Arrays.toString(a));
	
	Arrays.parallelSort(a);
	System.out.println(Arrays.toString(a));
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	Arrays.sort(a, Collections.reverseOrder());
	System.out.println(Arrays.toString(a));
	
  }

}
