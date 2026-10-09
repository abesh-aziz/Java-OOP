import java.util.Scanner;
class Student{
    private int id;
    private String name;

    public void setname(String name){
        this.name=name;
    }

    public void setid(int id){
        this.id=id;
    }

    public void showinfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Student ID: "+id);
    }
}

public class S{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int id;
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextInt();
        Student s1 = new Student();
        s1.setname(name);
        s1.setid(id);
        s1.showinfo();
        input.close();
    }
}