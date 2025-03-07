package payment;

public class CreditCardPayment implements PaymentStrategy{


    String cardNumber;
    String cardHolderName;

    public CreditCardPayment( String cardNumber, String cardHolderName) {

        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;

    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " By using Credit Card" );
        System.out.println(getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Payment: Credit card \n" + "Card Holder: " + cardHolderName + "\nCard Name: " + cardNumber;
    }
}