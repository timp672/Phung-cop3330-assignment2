/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex25;

import java.util.Scanner;

public class ex25
{
    static int passwordValidator(String passw)
    {
        char [] passArr;
        int i, value;
        passArr = passw.toCharArray();

        //for pass length less than 8
        if (passw.length() < 8)
        {
            boolean number = false, letter = false;
            //check for number
            for (i=0; i < passw.length(); i++)
            {
                if (Character.isDigit(passArr[i]))
                {
                    number = true;
                    break;
                }
            }
            //check for letter
            for (i=0; i < passw.length(); i++)
            {
                if (Character.isAlphabetic(passArr[i]))
                {
                    letter = true;
                    break;
                }
            }
            //numbers only
            if (number && !letter)
            {
                value = 1;
                return value;
            }
            //letters only
            else if (!number)
            {
                value = 2;
                return value;
            }
            else
                return 0;
        }
        //longer than 8 characters
        else
        {
            boolean number = false, letter = false;
            boolean special = false;
            //check for number
            for (i=0; i < passw.length(); i++)
            {
                if (Character.isDigit(passArr[i]))
                {
                    number = true;
                    break;
                }
            }
            //check for letter
            for (i=0; i < passw.length(); i++)
            {
                if (Character.isAlphabetic(passArr[i]))
                {
                    letter = true;
                    break;
                }
            }
            for (i = 0; i < passw.length(); i++)
            {
                if (!Character.isDigit(passArr[i]) && !Character.isAlphabetic(passArr[i]))
                {
                    special = true;
                    break;
                }
            }
            if (number && letter && !special)
            {
                value = 3;
                return value;
            }
            else if (number && letter)
            {
                value = 4;
                return value;
            }
            else
                return 0;
        }
    }
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        int passValue = passwordValidator(password);
        //output
        if (passValue == 1)
            System.out.println("The password '"+ password + "' is a very weak password.");
        else if (passValue == 2)
            System.out.println("The password '"+ password + "' is a weak password.");
        else if (passValue == 3)
            System.out.println("The password '"+ password + "' is a strong password.");
        else if (passValue == 4)
            System.out.println("The password '"+ password + "' is a very strong password.");
        else
            System.out.println("Error: re-enter password");
    }
}