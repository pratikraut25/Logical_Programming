package com.java.blogic;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in); // scanner input
		int number = sc.nextInt();                
		for (int i = 1; i < number; i++) {  // logic for perfect number
			if (number % i == 0)
				sum = sum + i;
		}
		if (number == sum)
			System.out.println("PERFECT NUMBER");
		else
			System.out.println("NOT PERFECT NUMBER");
	}

}
