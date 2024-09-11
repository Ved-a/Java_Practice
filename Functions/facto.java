package Functions;

public class facto {

    public static int facto(int n){
        int f=1;
        for(int i =1; i<=n; i++){
        f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
    
    // int n =7;
    // int sum=1;
    // int i =1;
    // while(i<=n){
    //     sum = sum*i;
    //     i++;
    // }
    // System.out.println("Sum of first "+n+" natural numbers is: "+sum);

        System.out.println(facto(7));

}
}
