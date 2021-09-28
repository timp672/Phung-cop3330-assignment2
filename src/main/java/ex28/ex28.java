/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex28;

import java.util.Scanner;

public class ex28
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int input = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            input = scan.nextInt();
            total += calculateTotal(input);
        }
        System.out.println("The total is " +total+ "." );
    }
    public static int calculateTotal(int input)
    {
        int total = 0;
        total += input;
        return total;
    }
}