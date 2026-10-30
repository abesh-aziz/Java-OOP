package Inheritence;
class Person{
    protected String name;
    protected int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void display(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
public class Student extends Person{
    private int id;
    private double cgpa;
    
    Student(String name, int age, int id, double cgpa){
        super(name, age); //letting the parent class set some of the parameters
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override public void display(){
        super.display();
        System.out.println("ID: "+id+", CGPA: "+cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Abesh", 22, 188, 2.92);
        s1.display();
    }
}
