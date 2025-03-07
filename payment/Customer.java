package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentDetails = "Paid: " + amount + "\n" + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentDetails);
    }

    public void showPaymentHistory() {
        System.out.println("Payment History for " + name);
        if (paymentHistory.isEmpty()) {
            System.out.println("No payments made yet.");
        }
        else {
            for (String payment : paymentHistory) {
                System.out.println(payment);
            }
        }
    }
}
