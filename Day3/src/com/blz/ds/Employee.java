package com.blz.ds;

import java.util.Random;

public class Employee {
    public static void main(String[] args)
    {
        final int empWagePerHour = 20;
        int fullTimeHours = 0;
        int partTimeHours = 0;
        int workingDaysPerMonth = 0;

        while(workingDaysPerMonth<20)
        {
            Random r = new Random();
            int attendance = r.nextInt(3);
            System.out.println("\nRandom value is: " +attendance);

            if (attendance == 1)
            {
                fullTimeHours=fullTimeHours+8;
                System.out.println(fullTimeHours);
            }
            else if (attendance == 2)
            {
                partTimeHours=partTimeHours+4;
                System.out.println(partTimeHours);
            }
            else
            {
                //System.out.println("\nEmployee is Absent");
            }
            workingDaysPerMonth++;
        }
        System.out.println("Total working hours:" +(fullTimeHours+partTimeHours));
        int monthlyWorkHours = (fullTimeHours + partTimeHours);
        int monthlyWage = empWagePerHour * monthlyWorkHours;
        System.out.println("Total wage for the month: " + monthlyWage);
    }
}