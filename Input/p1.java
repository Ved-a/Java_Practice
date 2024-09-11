package Input;
import java.util.*;
public class p1 {
    public static void main(String args[]){
        int sum=0,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        a= sc.nextInt();
        System.out.println("Enter the 2nd number");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum of two number is "+sum);
    }
}
