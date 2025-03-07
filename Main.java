import payment.*;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new PremiumCustomer("Hamed");
        Customer customer2 = new PremiumCustomer("Ali");
        Customer customer3 = new RegularCustomer("Amir");

        PaymentStrategy bitcoin = new BitcoinPayment("1SvJZ6LbxtbLTBju4TBEFTgEvF9rEsrM2A");
        PaymentStrategy creditcard = new CreditCardPayment("6280123456789101" , "Hosein");
        PaymentStrategy paypal = new PayPalPayment("Sweld1988@rhyta.com");

        customer1.displayCustomerInfo();
        System.out.println();
        customer2.displayCustomerInfo();
        System.out.println();
        customer3.displayCustomerInfo();
        System.out.println();

        customer1.makePayment(bitcoin, 70);
        System.out.println();
        customer1.makePayment(paypal, 50);
        System.out.println();

        customer2.makePayment(paypal, 50);
        System.out.println();
        customer2.makePayment(creditcard, 30);
        System.out.println();

        customer3.makePayment(creditcard, 100);
        System.out.println();
        customer3.makePayment(bitcoin, 80);
        System.out.println();

        customer1.showPaymentHistory();
        System.out.println();
        customer2.showPaymentHistory();
        System.out.println();
        customer3.showPaymentHistory();
        System.out.println();
    }
}
