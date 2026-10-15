class Const{
    String name, subject;
    int id;
    double marks;

    Const(String name){
        this.name=name;
    }

    Const(int id){
        this.id=id;
    }

    Const(String subject, double marks){
        this.subject=subject;
        this.marks=marks;
    }

    void showinfo(){
        System.out.println("Name: "+name+" ID: "+id+" Subject: "+subject+ " Marks: "+marks);
    }
}

public class Cons{
    public static void main(String[] args) {
        Const example1 = new Const("Abesh");
        Const example2 = new Const(188);
        Const example3 = new Const ("OOP", 76.00);
        example1.showinfo();
        example2.showinfo();
        example3.showinfo();
    }

}