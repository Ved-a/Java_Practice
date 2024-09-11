package Functions;
import java.util.*;

public class Moverloading {
    public static int multi(int a, int b){ // using paramtersss
        return a*b;
    }
    public static int multi(int a, int b, int c){ // using paramtersss
        return a*b*c;
    }
    public static double multi(double a, double b){ // using datatypes
        return a*b;
    }            
    
    public static void main(String[] args) {
        System.out.println(multi(19, 2));
        System.out.println(multi(19,28,1));
        System.out.println(multi(1.2, 7.3));
       
    }
}
