package Functions;

public class swap {
    public static void swap(int n, int m){
        int temp = n;
        n = m;
        m = temp;
        System.out.println("a=" +n);
        System.out.println("b=" +m);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        // System.out.println("a=" +a);
        // System.out.println("b=" +b);
    
}
}