//factorial of num

import java.util.Scanner;

public class RecursionP4 {
    static int f(int num){
        if(num == 0 ){
            return 1;
        }else{
            return num * f(num-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();
        System.out.println(f(num));
    }
}
