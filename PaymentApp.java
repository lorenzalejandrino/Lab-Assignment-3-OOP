package payment;

public class PaymentApp {

    public static void main(String[]args){

        PaymentMode gcash = new Gcash();
        PaymentMode maya = new Maya();
        PaymentMode shopeePay = new ShopeePay();


        Order order1 = new Order("Keyboard", 10, 300.0, gcash);

        System.out.println("Order item is " +order1.getItem());
        System.out.println("Unit Price is "+order1.getUnitPrice());
        System.out.println("Quantity is " +order1.getQuantity());

        System.out.println("\nPayment order details if "+order1.getMethod().getClass().getSimpleName());
        System.out.println("Discount rate is "+ order1.getMethod().getDiscount());
        System.out.println("Payment Amount is " + order1.getTotalAmount());

        Order order2 = new Order("Keyboard", 10, 300.0, maya);

        System.out.println("\nPayment order details if "+order2.getMethod().getClass().getSimpleName());
        System.out.println("Discount rate is "+ order2.getMethod().getDiscount());
        System.out.println("Payment Amount is " + order2.getTotalAmount());

        Order order3 = new Order("Keyboard", 10, 300.0, shopeePay);

        System.out.println("\nPayment order details if "+order3.getMethod().getClass().getSimpleName());
        System.out.println("Discount rate is "+ order3.getMethod().getDiscount());
        System.out.println("Payment Amount is " + order3.getTotalAmount());

    }
}