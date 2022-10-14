package com.java.junit;
import java.util.*;
public class VendingMachin{ 

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter you money: ");
	        int money = scanner.nextInt();

	        int denominations[] = {1000, 500, 100, 50, 10, 5, 2, 1};

	        int note = 0;

	        while (money > 0) {

	            int count = 0;

	            System.out.println("Remaining money: " + money);

	            while (money >= denominations[note]) {

	                money = money - denominations[note];

	                count++;

	}

}
	}
}
