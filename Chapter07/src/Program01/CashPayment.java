/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program01;

/**
 *
 * @author janellejlo
 */
public class CashPayment extends Payment{
    public CashPayment(){
        super(amount);
    }
    
    public String paymentDetails(double amount){
        return "\nPayMent Mode :Cash \n"+
        "Amount : "+super.paymentDetails(amount);
    }
    
    public static void main(String a[]) {
        CashPayment payment = new CashPayment();
        CashPayment payment2 = new CashPayment();
        System.out.println(payment.paymentDetails(23456));
        System.out.println(payment2.paymentDetails(435996));
    }
}
