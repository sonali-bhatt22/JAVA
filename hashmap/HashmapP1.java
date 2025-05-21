//how many times a number appears using hashmap
package hashmap;
import java.util.Scanner;

public class HashmapP1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5 ,3 , 4, 2};
        int n = arr.length;
        int[] hash = new int[13];
        for(int i=0; i<n;i++){
            hash[arr[i]] += 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int q = sc.nextInt();

        System.out.println(hash[q]);
         
    }
}
