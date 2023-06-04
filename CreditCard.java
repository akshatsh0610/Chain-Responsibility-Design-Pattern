public class CreditCard extends PaymentHandler
{
    public  CreditCard()
    {
        super("credit card");
    }

    @Override
    void setNext(PaymentHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }
    void process(int amount)
    {
        if(amount <= 50000)
        {
            System.out.println("payment process of ruppess" + " " + amount + " " + "by" + " " + this.name + " " + "handler");
        }
        else
        {
            super.process(amount);
        }
    }
}
