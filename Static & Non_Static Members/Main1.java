import java.util.Scanner;
class Student1{
    private String name;
    static String uni = "DIU";

    public void setname(String name){
        this.name=name;
    }

    public void showinfo(){
        System.out.println("Student name: "+name);
        System.out.println("Student university: "+uni);
    }

    static void showinfostat(Student1 obj){//static methods need an object to use non static members
        System.out.println("Name: "+obj.name);
        System.out.println("University: "+obj.uni);
    }
}

public class Main1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter Student 1's name: ");
        name = input.nextLine();
        Student1 s1 = new Student1();
        s1.setname(name);
        s1.showinfo();
        Student1.showinfostat(s1);
        input.close();

    }
}