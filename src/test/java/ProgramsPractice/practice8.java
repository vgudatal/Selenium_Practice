package ProgramsPractice;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {

		int a[] = {5,6,7,8,41};
		int l=0;
		int h=a.length-1;
		int sEle =6;
		boolean flag =false;
		
		while(l<h) {
			int m=(l+h)/2;
			
			if(a[m]==sEle) {
				flag=true;
				break;
			}else if (a[m]>sEle) {
				h=m-1;
			}else if (a[m]<sEle) {
				l=m+1;
			}
		}
		
		if(flag==true) {
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}
  }

}
