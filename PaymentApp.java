package payment;

public class PaymentApp {

    public static void main(String[]args){

        PaymentMode gcash = new Gcash();
        PaymentMode maya = new Maya();
        PaymentMode shopeePay = new ShopeePay();


        Order order1 = new Order("Keyboard", 10, 300.0, gcash);
        System.out.println("\nPayment order details if Gcash");
        System.out.println("Discount rate is 0.0");
        System.out.println("Payment Amount is " + order1.getTotalAmount());

        Order order2 = new Order("Keyboard", 10, 300.0, maya);
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount rate is 0.05");
        System.out.println("Payment Amount is : " + order2.getTotalAmount());

        Order order3 = new Order("Keyboard", 10, 300.0, shopeePay);
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount rate is 0.10");
        System.out.println("Payment Amount is: " + order3.getTotalAmount());

    }
}