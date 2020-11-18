/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Ahmed
 */
public class BankAccount {
    double accountNumber;
    double balance;
    double phoneNumber;
    String customerName;
    String email;
//    BankAccount(){}
    public BankAccount(double accountNumber,double balance,double phoneNumber,String customerName,String email){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdrawal(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        System.out.print("The money not enough");
        return false;
    }
    public double checkBalance(){
        return balance;
    }
    public boolean transfer(BankAccount other, double amount){
        if(balance >= amount){
            this.balance -= amount;
            other.balance += amount;
            return true;
        }
        System.out.print("The money not enough");
        return false;
    }
    public boolean checkName(String customerName){
        return this.customerName.equals(customerName);
    }
//    public boolean checkpass(String pass){
//        return this.pass.equals(pass);
//    }
}
