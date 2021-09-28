/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex26;

import java.util.Scanner;

public class ex26
{

    public static void main( String[] args )
    {
        double apr, balance, monthlyPay;
        //input
        Scanner scanBal = new Scanner(System.in);
        System.out.print("What is your balance? ");
        balance = scanBal.nextDouble();

        Scanner scanApr = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = scanApr.nextDouble();

        Scanner scanMonthly = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make? ");
        monthlyPay = scanMonthly.nextDouble();
        //output & calling
        PaymentCalculator calc = new PaymentCalculator(balance, apr, monthlyPay);
        double numMonths = calc.calculateMonthsUntilPaidOff(balance, apr, monthlyPay);

        System.out.println("It will take you " +String.format("%.0f",numMonths)+ " months to pay off this card." );
    }
}