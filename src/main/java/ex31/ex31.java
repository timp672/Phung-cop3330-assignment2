/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex31;

import java.util.Scanner;

public class ex31
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int restingPulse,age;

        while(true)
        {
            System.out.print("Enter Resting Pulse: " );
            String value = scan.nextLine();

            if(isNumber(value))
            {
                restingPulse = Integer.parseInt(value);
                break;
            }
            else
                System.out.println("Please enter a number" );
        }

        while(true)
        {
            System.out.print("Enter Age: " );
            String value = scan.nextLine();

            if(isNumber(value))
            {
                age = Integer.parseInt(value);
                break;
            }
            else
                System.out.println("Please enter a number" );
        }
        //output and formatting
        System.out.println("Resting Pulse : " +restingPulse+ "      Age : " +age);
        System.out.println("Intensity   | Rate");
        System.out.println("------------|----------");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
            int rate = ((220 - age - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity+"%\t\t\t| "+rate+" bpm");
        }
    }
    //function to check if input is a number
    public static boolean isNumber(String value)
    {
        try
        {
            Integer.parseInt(value);
        }catch(Exception e)
        {
            return false;
        }
        return true;
    }
}