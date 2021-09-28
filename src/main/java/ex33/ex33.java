/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex33;

import java.util.Scanner;
import java.util.Random;
public class ex33
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //random answers
        String [] outputs = {"Yes","No","Maybe","Ask again later"};
        Random random = new Random();
        //input
        System.out.println("What's your question? ");
        String input = scan.nextLine();
        //randomize and print
        int randomIndex = random.nextInt(outputs.length);
        randomize(randomIndex, outputs);

    }
    //randomize and print
    public static void randomize(int randomIndex, String [] outputs)
    {
        String output = outputs[randomIndex];
        System.out.println("\n" +output+ "\n");
    }
}