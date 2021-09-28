/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex32;

import java.util.Scanner;

public class ex32
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Guess the Number! \n");

        int correctNum = 0;
        int total = 0,difficulty, guessInt = 0;
        String guess;

        while(true)
        {
            //input
            total = 0;
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difficulty = scan.nextInt();
            if (difficulty == 1)
                correctNum = (int)(Math.random() * 10 + 1);
            else if (difficulty == 2)
                correctNum = (int)(Math.random() * 100 + 1);
            else
                correctNum = (int)(Math.random() *1000 + 1);

            System.out.print("I have my number. What's your guess? ");
            do {
                total++;
                guess = scan.next();
                //guess string so that non numeric answers are wrong guesses
                if (isNumeric(guess))
                {
                    guessInt = Integer.parseInt(guess);
                    if (guessInt == correctNum)
                        System.out.println("You got it in " +total+ " guesses!" );
                    else if (guessInt < correctNum)
                        System.out.print("Too low. Guess again: ");
                    else
                        System.out.print("Too high. Guess again: ");
                }
                else
                    System.out.print("Wrong. Guess again: ");
            }while (guessInt != correctNum);

            System.out.print("\nDo you wish to play again (y/n)? ");
            char k = scan.next().charAt(0);
            if(k=='n')
                break;
        }
    }
    //function to check if input is numeric
    public static boolean isNumeric(String guess)
    {
        try {
            Integer.parseInt(guess);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}