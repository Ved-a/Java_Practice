package Loops;
import java.util.*;


public class p5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        
        do{
            System.out.println("Enter the number");
            int n = s.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }while(true);
        
    }
}
