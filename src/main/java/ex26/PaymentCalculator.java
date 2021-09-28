/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tim Phung
 */
package ex26;

public class PaymentCalculator
{

    double bal;
    double apr;
    double monthly;

    //current objects
    public PaymentCalculator(double bal, double apr, double monthly)
    {
        this.bal = bal;
        this.apr = apr;
        this.monthly = monthly;
    }
    //calculations
    public static double calculateMonthsUntilPaidOff(double bal, double apr, double monthly)
    {
        apr = (apr / 36500);
        return (int) Math.ceil((-1.0/30.0)*Math.log(1 + bal / monthly * (1 - Math.pow((1 + apr),30))) / Math.log(1 + apr));
    }

}
