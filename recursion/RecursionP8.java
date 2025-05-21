//if a string is palindrome or not
package recursion;
import java.util.Scanner;

public class RecursionP8 { 
    static boolean f(String str, int i, int n){
        if(i>=n/2) return true;
        if(str.charAt(i) != str.charAt(n - i - 1)){
            return false;
        }
        return f(str, i+1, n);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str  = sc.nextLine();
        int n = str.length();
        sc.close();
        System.out.println(f(str, 0, n));
    }
    
}
