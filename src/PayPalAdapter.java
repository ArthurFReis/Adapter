public class PayPalAdapter implements Payment {

    private PayPal paypal;


    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(String amount) {
        paypal.sendPayment(amount);

    }
}
