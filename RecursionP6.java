//reverse an array using recursion two pointers

public class RecursionP6 {
    static void f(int arr[], int l, int r){
        if(l>=r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        f(arr, l+1, r-1);

    }
    public static void main(String[] args) {
        int[] arr  = {1, 4, 5, 6, 7};
        int n = arr.length;
        f(arr, 0, n-1);

         for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    }
}
