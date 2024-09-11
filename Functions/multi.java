package Functions;

public class multi {
    public static int multi(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        int c = multi(a, b);
        System.out.println("a*b= "+c);
        c = multi(10, 1);
        System.out.println("a*b= "+c);
        }
}
