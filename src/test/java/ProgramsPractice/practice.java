package ProgramsPractice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	
	int num = sc.nextInt();
	int Evencount=0;
	int Oddcount=0;
	int sum=0;
	
	while(num>0) {
		int rem = num%10;
		
		sum=sum+rem;
		if(rem%2==0) {
			Evencount++;
		}else {
			Oddcount++;
		}
		num=num/10;
	}
	System.out.println(Evencount+" "+Oddcount);
	System.out.println(sum);
  }

}
