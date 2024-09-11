package Functions;
import java.util.*;

public class sumofdigit {
    public static int sum(int n){
        int sum = 0;
        while(n>0){
           int ld= n%10;
           sum = sum+ld;
           n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The initial number is :"+n);
        System.out.println("The sum of digit is : "+sum(n));

    }
}
