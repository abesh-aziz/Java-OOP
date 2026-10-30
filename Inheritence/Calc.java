package Inheritence;

class calculator{
    int z;

    public void add(int x, int y){
        z = x+y;
        System.out.println("Addition: "+z);
    }

    public void subtract(int x, int y){
        z = x-y;
        System.out.println("Subtraction: "+z);
    }

}
public class Calc extends calculator {
    public void mult(int x, int y){
        z = x*y;
        System.out.println("Multiplication: "+z);
    } //methods can be declared inside public class outside of main method

    public void div(int x, int y){
        z = x/y;
        System.out.println("Division: "+z);
    }

    public static void main(String[] args) {
        Calc problem = new Calc();
        problem.add(10, 2);//inherited from parent class
        problem.subtract(10, 2);
        problem.mult(10, 2);//class' own method
        problem.div(10,2);
    }

}
