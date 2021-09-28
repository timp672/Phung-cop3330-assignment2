/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex34;

import java.util.Scanner;
import java.util.ArrayList;

public class ex34
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("There are 5 employees: ");
        //array of names
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%s\n", names.get(i));
        }
        System.out.print("Enter an employee name to remove: ");
        //processing
        String remove = scan.nextLine();
        names.remove(remove);
        //output
        System.out.println();
        for (int i = 0; i < 4; i++)
        {
            System.out.printf("%s\n", names.get(i));
        }
    }
}