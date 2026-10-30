class EmployeeEncap{
    private String name;
    private int id;
    private double salary;

    EmployeeEncap(String name, int id, double salary){
        this.name = name;
        this.id=id;
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("Salary must be positive "+this.salary);
        }
    }

    public void setID(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("Salary must be positive "+this.salary);
        }
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public double getSalary(){
        return salary;
    }
}
public class EmployeeEn {
    public static void main(String[] args) {
        EmployeeEncap e1 = new EmployeeEncap("Nadia", 201, 40000);
        EmployeeEncap e2 = new EmployeeEncap("Tanvir", 201, 35000);
        e1.setSalary(e1.getSalary()+5000);
        e2.setSalary(-1000);
        System.out.println(e1.getName()+" "+e1.getSalary());
        System.out.println(e2.getName()+" "+e2.getSalary());
    }
}
