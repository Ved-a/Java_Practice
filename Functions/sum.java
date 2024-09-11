package Functions;
import java.util.*;

public class sum {
public static int Sum(int n1, int n2){ // Formal parametersss
    int sum = n1+ n2;
    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc. nextInt();
        int sum = Sum(a, b); // arguments/ actual parametrss
        System.out.println("Sum" + sum);
    }
}
