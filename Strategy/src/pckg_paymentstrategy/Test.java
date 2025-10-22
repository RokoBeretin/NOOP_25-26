package pckg_paymentstrategy;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(100);
        cart.addItem(200);

        PaymentStrategy creditCardPayment = new CreditCardPayment();
        cart.pay(creditCardPayment);

        PaymentStrategy payPalPayment = new PayPalPayment();
        cart.pay(payPalPayment);
    }
}
