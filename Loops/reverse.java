package Loops;

public class reverse {
    public static void main(String[] args) {
        int n = 210803;
        while(n>0){
            int ld = n%10;
            System.out.print(ld);
            n = n/10;
        }
 System.out.println();

            int n1=102992;
            System.out.println(n1);
            int rev = 0;
            while(n1>0){
                int Ld = n1%10;
                rev = (rev*10)+ Ld;
                n1 = n1/10;
            }
           
            System.out.println(rev);
        }
       
    }
