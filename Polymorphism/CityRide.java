package Polymorphism;

abstract class Ride{
    protected String drivername;
    protected double distance;

    Ride(String drivername, double distance){
        this.drivername = drivername;
        this.distance = distance;
    }

    abstract double fare();
    abstract String type();
    public void receipt(){
        System.out.println(drivername+" drove "+type()+", Fee: "+fare());
    }
}

class Bike extends Ride{
    Bike(String drivername, double distance){
        super(drivername, distance);
    }
    @Override double fare(){
        return 20*distance;
    }
    @Override String type(){
        return "Bike";
    }
}

class Car extends Ride{
    Car(String drivername, double distance){
        super(drivername, distance);
    }

    @Override double fare(){
        return 50+35*distance;
    }

    @Override String type(){
        return "Car";
    }
}
class Premium extends Car{
    Premium(String drivername, double distance){
        super(drivername, distance);
    }
    @Override double fare(){
        return super.fare()*1.5;
    }

    @Override String type(){
        return "Premium Car";
    }
}

public class CityRide {
    public static void main(String[] args) {
        Ride[] ride = {
            new Bike("Rahim", 6),
            new Car("Karim", 10),
            new Premium("Salma", 10)
        };
        for(int i=0; i<ride.length; i++){
            ride[i].receipt();
        }
    }
}
