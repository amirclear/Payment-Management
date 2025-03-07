package payment;

public class BitcoinPayment implements PaymentStrategy {

    String walletAddress;

    public BitcoinPayment(String walletAddress) {

        this.walletAddress =walletAddress;

    }
    @Override
    public void pay(double amount) {

        System.out.println("Paid " + amount + " By using Bitcoin" );
        System.out.println(getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
        return "Payment : Bitcoin: Pay With BTC\n" + "Wallet Address: " + walletAddress;
    }
}
