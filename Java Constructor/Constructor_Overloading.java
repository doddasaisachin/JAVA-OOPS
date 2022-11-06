import java.util.*;
public class main{
    private String Name;
    main(){
        this.Name = "Johny";
    }
    main(String name){
        this.Name=name;
    }
    public void print_name(){
        System.out.println("names are : " + this.Name );
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String N = input.next();
        main obj1 = new main();
        main obj2 = new main(N);
        obj1.print_name();
        obj2.print_name();
    }
}