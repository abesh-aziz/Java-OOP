abstract class Pay{
    protected double amount;

    Pay(double amount){
        this.amount = amount;
    }

    abstract String method();
    abstract double fee();

    void receipt(){
        System.out.println("Paid Via "+method()+ ", Bill: "+amount+", Fees: "+fee()+" Total: "+(amount+fee()));
    }
}

class BkashPay extends Pay{
    @Override String method(){
        return "Bkash";
    }
   BkashPay(double amount){
    super(amount);
   }
   @Override double fee(){
    return amount*2/100;
   }
}

class CardPay extends Pay{
    CardPay(double amount){
        super(amount);
    }
    @Override String method(){
        return "Card";
    }
    @Override double fee(){
        return 25;
    }
}

class CashPay extends Pay{
    CashPay(double amount){
        super(amount);
    }
    @Override String method(){
        return "Cash";
    }
    @Override double fee(){
        return 0;
    }
}

public class Abstract{
    public static void main(String[] args) {
        Pay pay[] = {
        new BkashPay(1500.5),
        new CardPay(2000),
        new CashPay(3555.55),
    }; //array shorthand

    for(int i=0; i<pay.length; i++){
        pay[i].receipt();
    }
    }
}