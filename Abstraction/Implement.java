interface Notifier{
    void send(String to, String message); //public abstract void by default
}

class ViaEmail implements Notifier{
    @Override public void send(String to, String message){
        System.out.println("Emailt to: "+to+message);
    }
}

class ViaWhatsApp implements Notifier{
    @Override public void send(String to, String message){
        System.out.println("Message to: "+to+message);
    }
}

class ResultService{
    private Notifier notifier;
    ResultService(Notifier notifier){
        this.notifier = notifier;
    }

    void publish(String student, double cg){
        notifier.send(student, " Your CGPA is: "+cg);
    }
}

public class Implement{
    public static void main(String[] args) {
        ResultService viaemail = new ResultService(new ViaEmail());
        ResultService viamessage = new ResultService(new ViaWhatsApp());
        viaemail.publish("abesh@diu.edu.bd", 3.5);
        viamessage.publish("01987868768", 3.98);
    }
}