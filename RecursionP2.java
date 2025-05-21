import java.util.Scanner;

public class RecursionP2 {

    static void f(int i, int num){
        if(i> num){
            return;
        }else{
            System.out.println(i);
            f(i+1, num);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();
        f(1, num);
    }
}

