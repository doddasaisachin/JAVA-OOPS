public class MethodOverloading{
    public static void display(){
        System.out.println("no parameter");
    }
    public static void display(String a){
        System.out.println("Parameter : "+a);
    }
    public static void display(int a){
        System.out.println("Integer parameter : "+a);
    }
    public static void main(String[] args){
        display();
        display("Hello");
        display(3);
    }
}
