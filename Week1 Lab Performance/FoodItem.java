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

    void sell(int amount){
        if(amount<=this.quantity){
            System.out.println("Sold "+amount+" "+this.name);
            this.quantity=this.quantity-amount;
        }
        else{
            System.out.println("Not enough "+this.name+" in stock");
        }
    }

    
}