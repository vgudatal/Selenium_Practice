package ProgramsPractice;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	
	String str = sc.nextLine();
	String rev="";
	char[] ca =str.toCharArray();
	
	for(int i=ca.length-1;i>=0;i--) {
		//rev=rev+str.charAt(i);
		rev=rev+ca[i];
	}
	
	System.out.println(rev);
	
	if(str.equals(rev)) {
	System.out.println("Palindrome");	
	}else {
		System.out.println("Not a palindrome");
	}
	
  }

}
