public class PayPalPayment extends Payment {

    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing PayPal payment of " + amount +"€ for account " + email);
        return true;
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Account: " + email;
       
    }

    @Override
    public double calculateTransactionFee() {
        // TODO: Return fixed fee: 3.5
        return amount * 0.015;
       
    }
}
