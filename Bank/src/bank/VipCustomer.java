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
public class VipCustomer{
    String VipCustomerName;
    String emailAddress;
    double creditLimit;
    
    public VipCustomer(){
        //Empty
    }
    public VipCustomer(String VipCustomerName,String emailAddress){
        this.VipCustomerName = VipCustomerName;
        this.emailAddress = emailAddress;
    }
    public VipCustomer(String VipCustomerName,String emailAddress,double creditLimit){
        this.VipCustomerName = VipCustomerName;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

//    public VipCustomer(double accountNumber, double balance, double phoneNumber, String customerName, String email) {
//        super(accountNumber, balance, phoneNumber, customerName, email);
//    }
    
}
