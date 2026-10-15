class thisit{
    String name;
    int id;

    thisit(String name){
        this(name, 0);
    }

    thisit(String name, int id){
        this.name=name;
        this.id=id;
    }

    void showinfo(){
        System.out.println("Name: "+name+", ID: "+id);
    }

}
public class thising {
    public static void main(String[] args) {
        thisit ths = new thisit("Abesh");
        thisit ths2 = new thisit("Abesh", 188);
        ths.showinfo();
        ths2.showinfo();
    }
}
