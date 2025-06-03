// move all zeros to the end of the array
package array;

public class Problem3 {
    static void LocateNonZero(int[] arr, int n){
        int nonZeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                nonZeroCount++;
            }
        }

        int[] temp = new int[nonZeroCount];
        int tempFillIndex = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp[tempFillIndex] = arr[i];
                tempFillIndex++;
            }
        }
        int nz = temp.length;
        for(int i = 0; i<nz; i++){
            arr[i] = temp[i];
        }

        for(int i=nz; i<n; i++){
            arr[i] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4, 0, 0, 5, 1, 6}; 
        int n = arr.length;
        LocateNonZero(arr, n);
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }
    }
    
}
