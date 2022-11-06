import java.util.*;
public class main{
    Scanner input = new Scanner(System.in);
    private int a = input.nextInt();
    private int b;
    main(){
        b=a;
    }
    public static void main(String[] args){
        main obj = new main();
        System.out.println("Integer in Constructor : " + obj.b);
    }
}