/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex29;

import java.util.Scanner;

public class ex29
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int rate;
        //process input
        while(true)
        {
            System.out.print("What is the rate of return? " );
            
            if (scan.hasNextInt())
            {
                rate = scan.nextInt();
                if (rate > 0.0)
                    break;
            }
            System.out.println("Sorry. That's not a valid input." );
            scan.nextLine();
        }
        //output
        int years = getRate(rate);

        System.out.println("It will take " +years+ " years to double your initial investment." );
    }
    //calculation and print
    public static int getRate(int rate)
    {
        int years = 72 / rate;
        return years;
    }
}