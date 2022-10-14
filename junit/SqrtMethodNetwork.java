package com.java.junit;

public class SqrtMethodNetwork {

	
		double c = Double.parseDouble(args[0]);

        double epsilon = 1e-15;   
        double t = c;              

        
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2;
        }
        System.out.println("Square root of " + c + " = " + t);
	}

}
