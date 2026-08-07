package DesignPatterns.Creational.Factory;

public class PaymentFactory {
    public Payment getPayment(PaymentType paymentType) {
        switch (paymentType) {
            case CARD:
                return new CardPayment();
            case UPI:
                return new UpiPayment();
            default:
                break;
        }
        return new CashPayment();
    }
}
