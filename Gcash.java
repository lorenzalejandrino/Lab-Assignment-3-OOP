package payment;

public class Gcash implements PaymentMode {

    @Override
    public double calculateDiscount(double totalAmount) {
        return 0.0;
    }
}