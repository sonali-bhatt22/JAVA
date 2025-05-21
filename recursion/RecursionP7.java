
//reverse an array using recursion two pointers

public class RecursionP7 {
    static void f(int arr[], int i, int n){
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        f(arr, i+1, n);

    }
    public static void main(String[] args) {
        int[] arr  = {1, 4, 5, 6, 7};
        int n = arr.length;
        f(arr, 0, n);

         for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    }
}
