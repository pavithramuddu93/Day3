package com.blz.ds;

import java.util.Random;

public class Employee {
    public static void main (String[] args)
    {
        Random r = new Random();
        int attendance = r.nextInt(2);
        System.out.println("\nRandom value is: " +attendance);

        if (attendance == 1) {
            System.out.println("\nEmployee is Present");
        } else {
            System.out.println("\nEmployee is Absent");
        }

    }

}
