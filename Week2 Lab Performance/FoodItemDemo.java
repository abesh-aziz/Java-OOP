public class FoodItemDemo{
    public static void main(String[] args) {
        FoodItem i1 = new FoodItem("Khichuri",90, 12);
        FoodItem i2 = new FoodItem("Tea", 15, 40);
        FoodItem i3 = new FoodItem("Samosa", 10, 25);
        i1.printline(i1.name, i1.price, i1.quantity);
        i2.printline(i2.name, i2.price, i2.quantity);
        i3.printline(i3.name, i3.price, i3.quantity);
        System.out.println("Total Stock Value: Tk "+(i1.stockvalue(i1.price, i1.quantity)+i2.stockvalue(i2.price, i2.quantity)+i3.stockvalue(i3.price, i3.quantity)));


    }
}