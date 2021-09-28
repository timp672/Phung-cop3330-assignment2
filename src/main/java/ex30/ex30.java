/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex30;


public class ex30
{
    public static void main( String[] args )
    {
        for (int i = 1; i<=12; i++)
        {
            for (int j = 1; j <= 12; j++)
            {
                int k = i*j;
                //format the output to line up without tab character
                System.out.printf("%3d  ",k);
            }
            System.out.print("\n");
        }
    }
}