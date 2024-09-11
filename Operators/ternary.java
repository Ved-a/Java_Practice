package Operators;

public class ternary {
    public static void main(String[] args){
        int number=3;
        String type = ((number%2)==0) ? "even": "odd" ;
        System.out.println(type);
    }
}
