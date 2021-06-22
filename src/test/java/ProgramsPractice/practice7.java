package ProgramsPractice;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {

	int a[] = new int[5];
	a[0]=21;
	a[1]=15;
	a[2]=91;
	a[3]=22;
	a[4]=63;
	
	int sEle = 90;
	
	boolean flag = false;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==sEle) {
			flag=true;
		}
	}
	
	if(flag==true) {
		System.out.println("Element found :");
		
	}else {
		System.out.println("Element not found");
	}
  }

}
