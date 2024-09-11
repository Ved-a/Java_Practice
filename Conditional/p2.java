package Conditional;

public class p2 {
    public static void main(String args[]){
        int a=1, b=3,c=6;
        if(a>=b && a>=c){
            System.out.println("A is the Greatest Number");
        } else if(b>=c){
            System.out.println("B is the Greatest");
        }else{
            System.out.println("C is the Greatest");
        }
    }
}
