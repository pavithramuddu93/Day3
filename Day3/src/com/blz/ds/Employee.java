package com.blz.ds;

import java.util.Random;

public class Employee {
    public static void main(String[] args) {

        final int empWagePerHour = 20;
        final int fullTimeHours = 8;
        final int partTimeHours=4;

        Random r = new Random();
        int attendance = r.nextInt(3);
        System.out.println("\nRandom value is: " + attendance);

        if (attendance == 1) {
            System.out.println("\nEmployee is Present Full time");
            int ft_dailyWage = empWagePerHour * fullTimeHours;
            System.out.println("wage for the day is " +ft_dailyWage);
        } else if (attendance == 2) {
            System.out.println("\nEmployee is Present Part time");
            int pt_dailyWage = empWagePerHour * partTimeHours;
            System.out.println("wage for the day is " + pt_dailyWage);
        } else {
            System.out.println("\nEmployee is Absent");
        }
    }
}