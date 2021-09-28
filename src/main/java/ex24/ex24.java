/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class ex24
{
    static boolean isAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        else
        {
            //sorting letters and comparing strings
            char [] arrS1 = str1.toCharArray();
            char [] arrS2 = str2.toCharArray();
            Arrays.sort(arrS1);
            Arrays.sort(arrS2);

            return Arrays.equals(arrS1, arrS2);
        }
    }
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        //convert strings in order to compare
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //output
        if(isAnagram(str1,str2))
            System.out.println( str1+ " and " +str2+ " are anagrams");
        else
            System.out.println( str1+ " and " +str2+ " are not anagrams");

    }
}