package Operators;
public class operator {
    public static void main(String args[]){
        int a = 10;
        int b=5;
        int sum = a+b; //Perform Arithmetic operation---> Binary Operator
        System.out.println(sum); 



        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        
        int c1= 10;
        int d1 = c1++;
        System.out.println(c1);
        System.out.println(d1);


        //PROBLEM
        int x = 9, y = 12;
int a1 = 2, b1 = 4, c11 = 6;
int exp = 4/3 * (x + 34) + 9 * (a1 + b1 * c11) + (3 + y * (2 + a1)) / (a1 + b1*y);
System.out.println(exp);

}
}