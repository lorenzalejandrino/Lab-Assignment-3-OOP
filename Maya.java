package payment;

public class Maya implements PaymentMode{
    @Override
    public double getDiscount() {
        return 0.05;
    }
}