//Left rotate the array by d places
package array;

import java.util.Scanner;


public class Problem2 {
    public static void RotateArray(int[] arr, int d, int n){
        d = d % n;
        int[] temp = new int[d];
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i<n; i++){
            arr[i] = temp[i - (n-d)];
        }
        


    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number D");
        int D = sc.nextInt();
        RotateArray(arr, D, n);
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }
    }
   
    
}

