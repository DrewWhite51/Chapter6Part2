/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavingsAccount;

/**
 *
 * @author drewm
 */
public class SavingsAccount {
    public double startingBalance;
    public double currentBalance;
    public double amountWithdrew;
    public double amountDeposit;
    public double yearlyInterestRate = .1;
    public double monthlyInterestRate = yearlyInterestRate/12;

    public SavingsAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }
    
    public double accountWithdrawl(double currentBalance, double amountWithdrew) {
        return currentBalance - amountWithdrew;
    }
    
    public double accountDeposit(double currentBalance, double amountDeposit) {
        return currentBalance + amountDeposit;
    }
    
    public double accumulateInterest(double currentBalance, double monthlyInterestRate) {
        return ((monthlyInterestRate*currentBalance)+currentBalance);
    }
}
