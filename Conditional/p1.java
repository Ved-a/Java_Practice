package Conditional;
import java.util.*;

public class p1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income");
        int income = sc.nextInt();
        double tax;
        if(income > 1000000){
            tax = (int)(income*0.3);
            System.out.println("Pay 30% of Tax :" +tax);
        }else if(income>=500000 && income<=1000000){
            tax = (int)(income*0.2);
            System.out.println("Pay 20% of Tax :" + tax);
        }else{
            tax = 0;
            System.out.println("NO TAX :" +tax);
        }
;
    }
}
