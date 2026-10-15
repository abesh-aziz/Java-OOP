class Test{
    static int x=5;//since it's static the changes from calling change one case 1 will carry over while calling it again on case2
    int y=7;
    void change(){
        x++;
        y++;
    }
}

public class Testing{
    public static void main(String[] args) {
        Test case1 = new Test();
        Test case2 = new Test();
        case1.change();
        case2.change();
        System.out.println(Test.x);
        System.out.println(case1.y);
        System.out.println(case2.y);
    }
}