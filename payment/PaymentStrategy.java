package payment;

public interface PaymentStrategy {

    abstract void pay(double amount);

    abstract String getPaymentDetails();

}