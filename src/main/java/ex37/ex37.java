/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex37;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class ex37
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("What's the minimum length? ");
        int min = scan.nextInt();
        System.out.print("How many special characters? ");
        int specialAmt = scan.nextInt();
        System.out.print("How many numbers? ");
        int numAmt = scan.nextInt();
        //call and output
        String password = createPass(min,specialAmt,numAmt);
    }
    public static String createPass(int min, int specialAmt, int numAmt)
    {
        List<Character> special = new ArrayList<>();
        Random random = new Random();
        //special list
        String specialCharsList = "!@#&()–[{}]:;'?/*$^+=<>";
        for(char ch: specialCharsList.toCharArray()){
            special.add(ch);
        }
        //number list
        String nums = "0123456789";
        for(char ch: specialCharsList.toCharArray()){
            special.add(ch);
        }
        List<Character> numbersList = new ArrayList<>();
        for(char ch: nums.toCharArray()){
            numbersList.add(ch);
        }
        //letter list
        String letters = "abcdefghijklmnopqrstuvwxyz";
        List<Character> lettersList = new ArrayList<>();
        for(char ch: letters.toCharArray()){
            lettersList.add(ch);
        }
        //randomize password
        String password = "";
        for(int i=0;i<min-specialAmt-numAmt;i++){
            password+= lettersList.get(random.nextInt(lettersList.size()));
        }
        for(int i=0;i<specialAmt;i++){
            password+= special.get(random.nextInt(special.size()));
        }
        for(int i=0;i<numAmt;i++){
            password+=numbersList.get(random.nextInt(numbersList.size()));
        }
        char[] arr = password.toCharArray();
        for(int i=arr.length-1;i>0;i--){
            int j = random.nextInt(i+1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        password = new String(arr);
        System.out.println("Your password is " +password );
        return password;
    }
}