package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double result = (firstValue + secondValue) * 100.00d;
        System.out.println("Result: " + result);
        double remainder = result % 40.00d;
        System.out.println("Remainder: " + remainder);
        boolean booleanValue = remainder == 0 ? true : false;
        System.out.println("BooleanValue: " + booleanValue);
        if(booleanValue != true){
            System.out.println("Got some remainder");
        }

    }
}
