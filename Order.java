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
        calculateTotalAmount();
    }
    public void calculateTotalAmount(){
        double totalAmount = quantity * unitPrice;
        double discount = paymentMethod.calculateDiscount(totalAmount);
        this.totalAmount = totalAmount - discount;
    }
    public double getTotalAmount(){
        return totalAmount;
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
}