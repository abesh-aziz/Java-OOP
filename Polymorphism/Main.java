package Polymorphism;
class Shape{
    public double area(){
        return 0;
    }

    public String name(){
        return "Shape";
    }
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this.r = r;
    }

    @Override public double area(){
        return 3.14*r*r;
    }

    @Override public String name(){
        return "Circle";
    }
}

class Rectangle extends Shape{
    double l, w;

    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    @Override public double area(){
        return l*w;
    }

    @Override public String name(){
        return "Rectangle";
    }
}

public class Main {
public static void main(String[] args) {
    Shape[] shapes ={
        new Circle(12),
        new Rectangle(12, 13),
        new Shape()
    };
    double total=0;

    for(int i=0; i<shapes.length; i++){
        System.out.println(shapes[i].name()+" Area: "+shapes[i].area());
        total=total+shapes[i].area();
    }
    System.out.println("Total Area: "+total);
}
    

}
