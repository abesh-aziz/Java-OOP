import java.util.Scanner;
class Studenta{
    String name;
    int id;
    double marks;

    Studenta(String name, int id, double marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }

    void showinfo(){
            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
            System.out.println("Marks: "+marks);
        
    }

    static int highest(Studenta arr[]){//use static methods for a task to be completed on the entire dataset not a singular object
        double maxmarks = arr[0].marks;
        int index = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i].marks>maxmarks){
                maxmarks = arr[i].marks;
                index = i;
            }
        }
        return index;
    }

    static void search(Studenta arr[], int search){
        int index;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i].id==search){
                index = i;
                found = true;
                System.out.println("ID found at "+i+"th index");
                break;
            }
        }
        if(!found){
            System.out.println("ID not found");
        }
    }

}

public class Arr{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = input.nextInt();
        input.nextLine();
        Studenta arr[] = new Studenta[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Name of student "+(i+1)+": ");
            String name = input.nextLine();
            System.out.print("Enter ID of student "+(i+1)+": ");
            int id = input.nextInt();
            System.out.print("Enter Marks of student "+(i+1)+": ");
            double marks = input.nextDouble();
            arr[i] = new Studenta(name,id, marks);
            input.nextLine();

        }

        //System.out.println("------------------------Student Info------------------------------------");
        for(int i=0; i<arr.length; i++){
            arr[i].showinfo();
        }

        int index = Studenta.highest(arr);
        System.out.println("Topper Info: ");
        System.out.println("Name: "+arr[index].name);
        System.out.println("ID: "+arr[index].id);
        System.out.println("Marks: "+arr[index].marks);

        System.out.print("Enter ID you want to search: ");
        int search = input.nextInt();
        Studenta.search(arr, search);
        input.close();

    }
}