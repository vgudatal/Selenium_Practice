package ProgramsPractice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {

	int[] a1= {11,21,8,3,4};
	int min=a1[0];
	int max=a1[0];
	
	for(int i=1;i<a1.length-1;i++) {
		if(a1[i]<min) {
			min=a1[i];
		}
	 }
	System.out.println(min);
	
	for(int i=1;i<a1.length-1;i++) {
		if(a1[i]>max) {
			max=a1[i];
		}
	 }
	System.out.println(max);
  }

}
