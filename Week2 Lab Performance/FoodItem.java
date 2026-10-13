class FoodItem{
    String name;
    int price;
    int quantity;

    FoodItem(String name, int price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    int stockvalue(int price, int quantity){
        return price*quantity;
    }

    void printline(String name, int price, int quantity){
       System.out.println(name+ " | "+ "Tk "+price+" | "+"Qty "+quantity+ " | "+"Value "+stockvalue(price, quantity)); 
    }

    
}