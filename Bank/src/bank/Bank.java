
package bank;

import java.util.Scanner;


public class Bank {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1234,5000,2238,"ahmed","ahmedradi743@gmail.com");
        BankAccount b2 = new BankAccount(34,4000,2238,"ali","ahmedradi743@gmail.com");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter U name");
        String customerName = sc.nextLine();
        if(b1.checkName(customerName)){
            System.out.println("Hello " + " " + b1.customerName + "\nyour balance is " + " " + b1.balance);
            System.out.println("deposit or, withdrawal or, transfer");
            String op = sc.nextLine();
            switch(op){
                case "deposit":
                    System.out.println("Enter U Amount");
                    double depositAmount = sc.nextDouble();
                    b1.deposit(depositAmount);
                    System.out.println("Your  balance is" + " " + b1.checkBalance());
                    break;
                case "withdrawal":
                    System.out.println("Enter U Amount");
                    double withdrawalAmount = sc.nextDouble();
                    b1.deposit(withdrawalAmount);
                    System.out.println("Your  balance is" + " " + b1.checkBalance());
                    break;
                case "transfer":
                    System.out.println("Enter U name");
                    String Name = sc.nextLine();
                    if(b2.checkName(Name)){
                        System.out.println("Enter U Amount");
                        double amount = sc.nextDouble();
                        b1.transfer(b2, amount);
                        System.out.println("Your  balance is" + " " + b1.checkBalance());
                    }else{
                        System.out.println("Worning information");
                    }
                    break;
                    
                default:
                    System.out.println("Worning Operation");
            }
        }
    }
    
}
