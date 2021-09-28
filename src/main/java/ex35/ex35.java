/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex35;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ex35
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String strName;
        //array set up and randomizer
        ArrayList<String> names = new ArrayList<String>();
        Random random = new Random();

        do {
            System.out.print("Enter a name: ");
            strName = scan.nextLine();
            names.add(strName);
        }while(!strName.isEmpty());
        //randomize and print
        names.remove(names.size()-1);
        System.out.println("The winner is " +names.get(random.nextInt(names.size())));
    }
}