package com.tobiasekman;

public class Main {

    public static void main(String[] args) {

        CoolNumbersClass coolNumbersClass = new CoolNumbersClass(new int[] {12,50,23,89});
        System.out.println("The best number is: " + coolNumbersClass.getSumFromLowestAndHighestNumber());

    }
}
