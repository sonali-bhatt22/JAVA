// Missing Number 

package array;

public class Problem8 {

    static int MissingNumber(int[] a, int N){
        int xor1 = 0; int xor2 = 0;
        int n = N - 1;
        for(int i = 0; i<n; i++){
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^  (i+1);
        }
        xor1 = xor1 ^ N;
        return xor1 ^ xor2;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int N = 5;
        System.err.println(MissingNumber(a, N));
    }
}
