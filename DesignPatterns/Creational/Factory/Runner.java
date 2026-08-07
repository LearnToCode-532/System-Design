package DesignPatterns.Creational.Factory;

public class Runner {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.getPayment(PaymentType.UPI);
        payment.doPayment();
        payment = paymentFactory.getPayment(PaymentType.CASH);
        payment.doPayment();
        payment = paymentFactory.getPayment(PaymentType.CARD);
        payment.doPayment();
    }
}
