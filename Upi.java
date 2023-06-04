public class Upi extends PaymentHandler
{
    public Upi()
    {
       super("upi");
    }

    @Override
    void setNext(PaymentHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }

    @Override
    void process(int amount)
    {
       if(amount <= 5000)
       {
           System.out.println("payment process of ruppess" + " " + amount + " " + "by" + " " + this.name + " " + "handler");
       }
       else
       {
           super.process(amount);
       }
    }
}
