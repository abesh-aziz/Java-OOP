package Inheritence;

class Vehicle{
    protected int speed=80;

    Vehicle(String color){
        System.out.println("Car created with the color "+color);
    }

    public void display(){
        System.out.println("Vehicle is running at "+speed+"KMH");
    }

}

public class Car extends Vehicle{
    int speed=70;
    public Car(){
        super("Black");//since the constructor of the parent class is non parameterized it must be called with the right parameters
        System.out.println("Car created");//after parent class' constructor finishes compiling then the child class version compiles
    }

    public void display(){
        System.out.println("Car is running at "+speed+"KMH");
        System.out.println("Vehicle speed: "+super.speed+"KMH");
    }

    public static void main(String[] args) {
        Car panzer = new Car();
        panzer.display();
    }
}
