package Conditional;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        System.out.println("Enter the Operation to perform : ");
        System.out.println("1. Addition : ");
        System.out.println("2. Subtraction : ");
        System.out.println("3. Multiplication : ");
        System.out.println("4. Division : ");
        int n = sc.nextInt();
        switch(n){
            case 1 :
            System.out.println("Result :" +(a+b));
            break;
            case 2 :
            System.out.println("Result :" +(a-b));
            break;
            case 3 :
            System.out.println("Result :" +(a*b));
            break;
            case 4 :
            System.out.println("Result :" +(a/b));
            break;
            default :
        System.out.println("Enter Correct Option");
      } 

    }

}
