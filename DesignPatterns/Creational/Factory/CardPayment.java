package DesignPatterns.Creational.Factory;

public class CardPayment implements Payment{
    
    @Override
    public void doPayment() {
        // UPI payment Buisness logic
        System.out.println("Payment done via Card");
    }
}
