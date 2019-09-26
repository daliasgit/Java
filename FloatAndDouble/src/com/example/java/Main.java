package com.example.java;

public class Main {

    public static void main(String[] args) {

	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        float myFloatNumber = 3f;
        double numberOfPound = 200;
        double numberOfKilogram = numberOfPound * 0.45359237;
        System.out.println(numberOfKilogram);
        System.out.println(numberOfPound);
        System.out.println(myFloatNumber);

    }
}
