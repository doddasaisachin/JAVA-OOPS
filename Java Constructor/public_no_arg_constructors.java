class comp {
    int a;
    public comp() {
        a=25;
    }
}
public class main {
    public static void main(String[] args) {
        comp obj = new comp();
        System.out.println(obj.a);
    }
}