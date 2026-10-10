class Employee{
    String name;
    int id;
    static int count = 0;
    static String company = "No comapany loser. Get a job first";
    Employee (String name, int id){
        this.name = name;
        this.id = id;
        count++;
    }

    void showinfo(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee company: "+company);
    }

}


public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abesh", 188);
        Employee e2 = new Employee("John", 101);
        e1.showinfo();;
        e2.showinfo();
        System.out.println("Total number of objects: "+Employee.count);

    }
}
