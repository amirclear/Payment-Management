package payment;

public class PayPalPayment implements PaymentStrategy {

    String email;

    public PayPalPayment(String email) {

        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " By using PayPal" );
        System.out.println(getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Payment : PayPal \n" + "Email: " + email;
    }
}