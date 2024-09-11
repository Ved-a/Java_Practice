package Loops;

public class prime {
    public static Boolean isprime(int n){
        // Boolean isprime= true;
        for(int i = 2; i<=n-1; i++){
            if(i%2==0){
                // isprime=false;
                // break;
                return false;
            }
        }
        // return isprime;
        return true;
    }
        public static void main(String[] args) {
            System.out.println(isprime(2));
        }
}
