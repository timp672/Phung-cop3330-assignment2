/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class ex38
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scan.nextLine();
        String[] list = input.split(" ");
        Integer[] evenList = filterList(list);
        //output
        printList(evenList);
    }
    //processing
    public static Integer[] filterList(String list[])
    {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i=0; i<list.length; i++)
        {
            int num = Integer.parseInt(list[i]);

            if(num%2 ==0)
                newList.add(num);
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr;
    }
    //print function
    public static void printList(Integer[] evenList)
    {
        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1)
                System.out.print(evenList[i] + " ");
            else
                System.out.print(evenList[i] + ".");

        }
    }
}