import java.util.Scanner;
class Student {
    int id;
    String name;
    double marks;

    public void display(){
        System.out.println("ID: "+id+", Name: "+name+" ,Marks: "+marks);
    }

    static Student highest(Student students[]){
        Student topper = students[0];
        for(int i=1; i<students.length; i++){
            if(students[i].marks>topper.marks){
                topper=students[i];
            }
    }
            return topper;
}

     static Student lowest(Student students[]){
        Student dabba = students[0];
        for(int i=1; i<students.length; i++){
            if(students[i].marks<dabba.marks){
                dabba=students[i];
            }         
    }
            return dabba;
}

    static double averagemarks(Student arr[]){
        double sum=0, average;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i].marks;
        }
        average = sum/arr.length;
        return average;
    }

    static int aboveaverage(Student arr[], double avg){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].marks>avg){
                count++;
            }
        }
        return count;
    }

}

public class Week4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student students[] = new Student[5];

        for(int i=0; i<students.length; i++){
            students[i] = new Student();
        }

        for(int i=0; i<students.length; i++){
            System.out.println();
            System.out.print("Enter infromation for student "+(i+1));
            System.out.println();
            System.out.print("ID: ");
            students[i].id = input.nextInt();
            input.nextLine();
            System.out.print("Name: ");
            students[i].name = input.nextLine();
            System.out.print("Marks: ");
            students[i].marks = input.nextDouble();
            input.nextLine();
            
        }

        System.out.print("===== Student Information =====");
        System.out.println();
        for(int i=0; i<students.length; i++){
            students[i].display();
        }

        System.out.println();
        System.out.println("===== Top Student =====");
        Student.highest(students).display();

        System.out.println();
        System.out.println("Average Marks: "+Student.averagemarks(students));

        System.out.println();
        System.out.println("===== Anti Top Student =====");
        Student.lowest(students).display();

        System.out.println();
        System.out.println("Number of students who scored above average: "+Student.aboveaverage(students, Student.averagemarks(students)));
        input.close();
    }
}