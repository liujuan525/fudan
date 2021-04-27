package chapter4;

public class InitDemo {
    int x = 100 ;
    {
        x = 60 ;
        System.out.println("x in initial block = " + x);
    }
    public InitDemo(){
        x = 58 ;
        System.out.println("x in constructor = " + x);
    }
    public static void main(String[] args){
        InitDemo d = new InitDemo();
        System.out.println("after constructor = " + d.x);
    }
}
