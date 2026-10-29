interface Printable{
    void print(String doc);
}

interface Scannable{
    void scan(String doc);
}

interface Copier extends Printable, Scannable{
    default void copy(String doc){
        print(doc);
        scan(doc);
    }
}

class OfficeMachine implements Copier{
    @Override public void print(String doc){
        System.out.println("Printing: "+doc);
    }
    @Override public void scan(String doc){
        System.out.println("Scanning: "+doc);
    }
}

class SmartPhone implements Scannable{
    @Override public void scan(String doc){
        System.out.println("Phone Camera Scanning: "+doc);
    }
}

public class Implement2{
    public static void main(String[] args) {
        OfficeMachine notice = new OfficeMachine();
        notice.copy("Notice.pdf");
        Scannable[] arr = {notice, new SmartPhone()};
        for(int i=0; i<arr.length; i++){
            arr[i].scan("IDCard");
        }
    }
}