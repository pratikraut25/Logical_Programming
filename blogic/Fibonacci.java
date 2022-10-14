package com.java.blogic;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int firstTerm = 0;
		int secondTerm = 1;

		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter the number you want to print for fibonacci series : ");
		int term = sc.nextInt();
		System.out.println("Fibonacci series till " + term + " is : ");
		for (int i = 1; i <= term; i++) {
			System.out.println(firstTerm);
			int nextTerm = firstTerm + secondTerm; // computation logic for fibonacci series
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
