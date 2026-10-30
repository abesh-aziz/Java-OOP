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
        EmployeeE e1 = new EmployeeE("Abesh", 188);
        EmployeeE e2 = new EmployeeE("John", 101);
        e1.showinfo();;
        e2.showinfo();
        System.out.println("Total number of objects: "+EmployeeE.count);

    }
}
