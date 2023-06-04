public class Check extends PaymentHandler
{
    public Check()
    {
        super("check");
    }

    @Override
    void setNext(PaymentHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }

    void process(int amount)
    {
        if(amount <= 500000)
        {
            System.out.println("payment process of ruppess" + " " + amount + " " + "by" + " " + this.name + " " + "handler");
        }
        else
        {
            super.process(amount);
        }
    }
}