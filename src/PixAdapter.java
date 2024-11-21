public class PixAdapter implements Payment {

    private Pix pix;

    public PixAdapter(Pix pix) {
        this.pix = pix;
    }

    @Override
    public void processPayment(String amount) {
        pix. makePayment(amount);
    }
}
