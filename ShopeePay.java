package payment;

public class ShopeePay implements PaymentMode {
    @Override
    public double calculateDiscount(double totalAmount) {
        return 0.10 * totalAmount;
    }
}