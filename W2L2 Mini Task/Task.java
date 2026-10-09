import java.util.Scanner;
public class Task{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int id, age;
        double cgpa;
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter CGPAP: ");
        cgpa = input.nextDouble();
        System.out.println("Name: "+name);
        System.out.println("ID: "+ id);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
        input.close();
    }
}