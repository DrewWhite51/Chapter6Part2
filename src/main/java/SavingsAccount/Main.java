/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavingsAccount;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        System.out.println("How much money are you starting with in your account?");
        double startingBalance = keyboard.nextDouble();
        
        double currentBalance;
        double yearlyInterestRate = .1;
        double monthlyInterestRate = yearlyInterestRate/12;
        double interestAccumulation = 0;
        int depositCounter = 0;
        int withdrawlCounter = 0;
        SavingsAccount mySavings = new SavingsAccount(startingBalance);
        
        currentBalance = startingBalance;
        System.out.println("Before interest or deposits your current balance is " + formatter.format(currentBalance));
        // Loop for withdrawls and deposits for a month
        for (int counter = 1; counter<=12; counter++) {
            System.out.println("How much did you deposit in month " + counter + "?");
            double monthlyDeposit = keyboard.nextDouble();
            currentBalance = mySavings.accountDeposit(currentBalance, monthlyDeposit);
            System.out.println("How much did you withdrawl this month? ");
            double monthlyWithdrawl = keyboard.nextDouble();
            currentBalance = mySavings.accountWithdrawl(currentBalance, monthlyWithdrawl);
            currentBalance = mySavings.accumulateInterest(currentBalance, monthlyInterestRate);
            interestAccumulation += mySavings.accumulateInterest(currentBalance, monthlyInterestRate) - currentBalance; 
            System.out.println("Your current account balance after month " + counter + 
                    " is " + formatter.format(currentBalance));
            // Counters for # of deposits and withdrawls
            if (monthlyDeposit >= .1 ) {
                depositCounter++;
            }
            if (monthlyWithdrawl >= .1) {
                withdrawlCounter++;
            }
        }
        // Final numbers 
        System.out.println("Your balance at the end of this year is " + formatter.format(currentBalance));
        System.out.println("Amount of deposits this year = " + depositCounter);
        System.out.println("Amount of withdrawls this year = " + withdrawlCounter);
        System.out.println("The total amount of interest accumulated this month = " + formatter.format(interestAccumulation));
    }
}
