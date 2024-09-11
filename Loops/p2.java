package Loops;
import java.util.*;
import java.util.Scanner;

public class p2 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = s.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter +" ");
            counter++;
        }
     }
}
