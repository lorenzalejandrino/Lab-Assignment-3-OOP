package payment;

public class Maya implements PaymentMode{
    @Override
    public double calculateDiscount(double totalAmount) {
        return 0.05 * totalAmount;
    }
}