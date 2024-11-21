
public class Main {
    public static void main(String[] args) {
        PayPal paypal = new PayPal();
        Pix pix = new Pix();
        Payment payment = new PayPalAdapter(paypal);
        Payment payment2 = new PixAdapter(pix);

        payment.processPayment("1200.00");
        payment2.processPayment("1400.00");


        }


    }
