/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex36;

import java.util.Scanner;
import java.util.ArrayList;

public class ex36
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String str;

        //input
        do
        {
            System.out.print("Enter a number: ");
            str = scan.next();
            if(!str.equals("done")) {
                try {
                    int num = Integer.parseInt(str);
                    arr.add(num);
                }
                catch(NumberFormatException ignored) {

                }
            }
        }while (!str.equals("done"));
        printNum(arr);

        //output
        System.out.println("The average is " +average(arr));
        System.out.println("The minimum is " +min(arr));
        System.out.println("The maximum is " +max(arr));
        System.out.println("The standard deviation is " +String.format("%.2f", standD(arr)));
    }
    //print numbers
    public static void printNum(ArrayList<Integer> arr)
    {
        System.out.print("Numbers: ");
        for (int i =0; i<arr.size(); i++)
        {
            if(i!=arr.size()-1)
                System.out.print(+arr.get(i)+",");
            else
                System.out.println(arr.get(i));
        }
    }
    //average function
    public static double average(ArrayList<Integer> arr)
    {
        double average = 0;
        for (Integer integer : arr)
            average = average + integer;
        average = average/arr.size();
        return average;
    }
    //maximum function
    public static int max(ArrayList<Integer> arr)
    {
        if(arr.size()==0)
            return 0;
        int j = arr.get(0);
        for (Integer integer : arr)
        {
            if (j < integer)
                j = integer;
        }
        return j;
    }
    //minimum function
    public static int min(ArrayList<Integer> arr)
    {
        if(arr.size()==0)
            return 0;
        int j = arr.get(0);
        for (Integer integer : arr)
        {
            if (j > integer)
                j = integer;
        }
        return j;
    }
    //standard deviation function
    public static double standD(ArrayList<Integer> arr)
    {
        double sum = 0,sd = 0.0, mean = 0;
        int n = arr.size();
        for (int i = 0;i < n;i++)
            sum = sum + arr.get(i);

        mean = sum/(n);

        for (Integer integer : arr)
            sd = sd + Math.pow((integer - mean), 2);

        return Math.sqrt(sd / n);
    }
}