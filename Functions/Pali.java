package Functions;
import java.util.*;

public class Pali {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Our Number is "+n);
        int temp = n;


        int rev = 0;
        
        while(temp>0){
        int ld=temp%10;
        rev = (rev*10)+ld;
        temp=temp/10;

    }
    
    System.out.println("The reverse of the string is "+rev);
    System.out.println("The n of the string is "+n);
    System.out.println("The temp of the string is "+temp);
    
    
    if(n==rev){
        System.out.println("The number is palindrome");
    }
    else{
        System.out.println("The number is not palindrome");
    }
     
    
   
}
}
