package payment;

public class ShopeePay implements PaymentMode {
    @Override
    public double getDiscount() {
        return 0.10;
    }
}