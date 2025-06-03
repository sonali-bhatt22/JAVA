package recursion;
import java.util.Scanner;

public class RecursionP3 {
    static void f(int i, int sum){
        if(i<1){
            System.out.println(sum);

        }else{
            f(i-1, sum + i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();
        f(num, 0);
    }
}
