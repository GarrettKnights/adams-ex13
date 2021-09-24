
/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise13;

import java.util.*;

public class Solution13 {
    public static void main(String[] args) {

        //Initializes scanner
        Scanner ScanWord = new Scanner(System.in);

        //Declares variables we will be using
        double principal;
        double IntRate;
        int years;
        int compounded;

        //Asks user for input
        System.out.print("What is the principal amount? ");
        //Scans principal input
        principal = ScanWord.nextDouble();
        //Asks user for input
        System.out.print("What is the rate? ");
        //Scans rate input
        IntRate = ScanWord.nextDouble();
        //Asks user for input
        System.out.print("What is the number of years? ");
        //Scans years input
        years = ScanWord.nextInt();
        //Asks user for input
        System.out.print("What is the number of times the interest is compounded per year? ");
        //Scans compound input
        compounded = ScanWord.nextInt();

        //Calculates the % interest rate
        double ActualRate = IntRate / 100;
        //Calculates part of the equation
        double equationrn = 1 + (ActualRate / compounded);

        double equationnt = compounded * years;

        double equation2d = Math.pow(equationrn, equationnt) ;
        //Finishes interest rate equation
        double final2 = principal * equation2d;

        //Rounds to nearest penny
        double final3 = Math.ceil(final2 * 100.0) / 100.0;

        //Final print statement
        System.out.print("$" + principal + " invested at " + IntRate + "% for " + years + " years compounded " + compounded + " times per year is $" + final3);
    }
}
