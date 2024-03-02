package payment;

public class Order {

    private String item;
    private int quantity;
    private double unitPrice;
    private PaymentMode paymentMethod;
    private double totalAmount;
    public Order(String item, int quantity, double unitPrice, PaymentMode paymentMethod) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.paymentMethod = paymentMethod;
    }

    public double getTotalAmount(){
        return (unitPrice*quantity)*(1-paymentMethod.getDiscount());
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public PaymentMode getMethod() {
        return paymentMethod;
    }

    public PaymentMode setMode(PaymentMode paymentMethod) {
        this.paymentMethod = paymentMethod;
        return paymentMethod;
    }
}