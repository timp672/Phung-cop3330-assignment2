/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex27
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //input
        System.out.print("Enter the first name: ");
        String first = input.nextLine();
        System.out.print("Enter the last name: ");
        String last = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String ID = input.nextLine();

        validateAll(first, last, zip, ID);
    }
    //validate all
    public static void validateAll(String first, String last, String zip, String ID)
    {
        boolean firstFlag = validateFirst(first);
        boolean lastFlag = validateLast(last);
        boolean zipFlag = validateZip(zip);
        boolean IDFlag = validateID(ID);
        if (firstFlag && lastFlag && zipFlag && IDFlag)
            System.out.println("There were no errors found\n" );

    }
    //validate first name
    public static boolean validateFirst(String first)
    {
        boolean val = true;
        if (first.length()==0)
        {
            System.out.println("The first name must be filled.\n" );
            val = false;
        }
        //at least 2 characters
        if (first.length() < 2)
        {
            System.out.println("The first name must be at least 2 characters long.\n" );
            val = false;
        }
        return val;
    }
    //validate last name
    public static boolean validateLast(String last)
    {
        boolean val = true;
        if (last.length()==0)
        {
            System.out.println("The last name must be filled.\n" );
            val = false;
        }
        //at least 2 characters
        if (last.length() < 2)
        {
            System.out.println("The last name must be at least 2 characters long.\n" );
            val = false;
        }
        return val;
    }
    //validate zip code
    public static boolean validateZip(String zip)
    {
        boolean val = true;
        char [] convertZip = zip.toCharArray();
        //zip code format
        for (char c : convertZip) {
            if (Character.isAlphabetic(c)) {
                val = false;
            } else if (zip.length() != 5) {
                val = false;
            }
        }
        if (!val)
            System.out.println("The zipcode must be a 5 digit number.\n" );
        return val;
    }
    //validate employee id
    public static boolean validateID(String ID)
    {
        boolean val = true;
        //format of employee ID's
        String format = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if (!Pattern.matches(format, ID))
        {
            System.out.println("The employee ID must be in the format of AA-1234.\n" );
            val = false;
        }
        return val;
    }
}