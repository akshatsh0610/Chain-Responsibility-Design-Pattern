// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        PaymentHandler upiHandler = new Upi();
        PaymentHandler creditCard = new CreditCard();
        PaymentHandler check = new Check();

        upiHandler.setNext(creditCard);
        creditCard.setNext(check);

        upiHandler.process(4000);
    }
 }