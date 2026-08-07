package DesignPatterns.Creational.Factory;

public class UpiPayment implements Payment {

    @Override
    public void doPayment() {
        // UPI payment Buisness logic
        System.out.println("Payment done via UPI");
    }
    
}
