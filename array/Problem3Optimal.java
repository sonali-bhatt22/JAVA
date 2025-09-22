//Optimal solution foir locating zero to end of the given array
package array;

public class Problem3Optimal {
    static int[] LocatingZerosOptimalSolution(int[] arr, int n){
        int j = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return arr;
        int temp;
        for(int i=j+1; i<n;i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4, 0, 0, 5, 1, 6}; 
        int n = arr.length;
        LocatingZerosOptimalSolution(arr, n);
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }
    }
    
}
