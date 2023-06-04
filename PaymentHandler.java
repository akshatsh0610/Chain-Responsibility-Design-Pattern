public abstract class PaymentHandler
{
    String name;
    PaymentHandler nextHandler;
    private PaymentHandler()
    {

    }

    public PaymentHandler(String name)
    {
        this.name = name;
    }
    abstract void setNext(PaymentHandler nextHandler);

    void process (int amount)
    {
        if(this.nextHandler != null)
            this.nextHandler.process(amount);
        else
            System.out.println("request cannot be processed");
    }
}
