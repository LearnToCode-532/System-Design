package DesignPatterns.Creational.Factory;

public class CashPayment implements Payment {
    
    @Override
    public void doPayment() {
        // Cash payment Buisness logic
        System.out.println("Payment done via Cash");
    }
}
