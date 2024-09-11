package Input;
import java.util.*;
public class p3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Double pie = 3.142;
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double a = pie * r*r;
        System.out.println("The area of the circle is "+a);
    }
}
