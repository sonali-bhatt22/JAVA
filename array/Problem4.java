//linear search
package array;

import java.util.Scanner;

public class Problem4 {

    static int LinearSearch(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 5, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.err.println("enter num");
        int num = sc.nextInt();
        System.err.println(LinearSearch(arr, num));
        
    }
    
}
