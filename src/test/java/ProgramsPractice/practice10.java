package ProgramsPractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh.mm.ss");
		String sdt1= sdf.format(dt);
		System.out.println(sdt1);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalTime lt =LocalTime.now();
		System.out.println(lt);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
	}	  
}
