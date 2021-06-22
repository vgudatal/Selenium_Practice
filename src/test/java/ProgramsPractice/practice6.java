package ProgramsPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("./sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
		FileWriter fw = new FileWriter(System.getProperty("user.dir")+"// sample.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am writing ");
		
		br.close();
		bw.close();
		
	
  }

}
