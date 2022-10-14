package com.java.blogic;
import java.util.Scanner;
public class StopWatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter '0' to start stopwatch!");
		int watch = scanner.nextInt();
		long startMillis = System.currentTimeMillis();
		System.out.println("Stopwatch starts!");
		System.out.println("Enter '1' to stop stopwatch!");
		watch = scanner.nextInt();
		long stopMillis = System.currentTimeMillis();
		double elapse = stopMillis - startMillis;
		double seconds = elapse / 1000;
		System.out.println("Time elapse in seconds = " + seconds +"sec");
}
}