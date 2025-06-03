//fabonacci series 
package recursion;
import java.util.Scanner;

public class RecursionP9 {
    static int f(int n){
        if(n <=1 ){
            return n;
        } else{
            int last = f(n-1);
            int secLast = f(n-2);
            return last + secLast;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(f(n));
    }
}
