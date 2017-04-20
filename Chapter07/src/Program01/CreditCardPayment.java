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
import java.util.Date;

public class CreditCardPayment extends Payment{
    
    private String cardHolderName;
        public String getCardHolderName() {
        return cardHolderName;
    }
        
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    
    public Date getExpiryDate() {
        return expiryDate;
    }
    
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public long getCreditCardNumber() {
        return creditCardNumber;
    }
    
    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    private Date expiryDate;
    private long creditCardNumber;
    
    public CreditCardPayment(String cardHolderName,Date expiryDate, long creditCardNumber){
        super(amount);
        this.cardHolderName = cardHolderName;
        this.creditCardNumber = creditCardNumber;
        this.expiryDate = expiryDate;
    }
    
    public String paymentDetails(double amount){
        return "cardHolderName : "+cardHolderName+
        "\ncreditCardNumber :"+ creditCardNumber+
        "\nexpiryDate :"+ expiryDate+"\n"+
        super.paymentDetails(amount);
    }
    
    public static void main(String a[]) {
        CreditCardPayment payment = new CreditCardPayment("sumitha",new Date(),12345678);
        CreditCardPayment payment2 = new CreditCardPayment("sudhakar",new Date(),445235678);
        System.out.println(payment.paymentDetails(1234));
        System.out.println(payment2.paymentDetails(4356));
    }
}