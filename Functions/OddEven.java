package Functions;
import java.util.*;

public class OddEven {

    public static Boolean iseven(int n){
        Boolean iseven = true;
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Boolean Result = iseven(n);
        System.out.println(Result);
        if(iseven(n)){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }

        }


    }
