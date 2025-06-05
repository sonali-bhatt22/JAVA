//Union of two arrays

package array;

import java.util.HashSet;
import java.util.Set;

public class Problem6 {
    static int[] ArraysUnion(int[] a, int[] b){
        Set<Integer> st = new HashSet<>();

        for (int value : a) {
            st.add(value);
        }

        for (int value : b) {
            st.add(value);
        }

       
        int[] result = new int[st.size()];
        int i = 0;
        for (int value : st) {
            result[i++] = value;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 7, 5};
        int[] b = {1, 2, 3, 8, 9, 10};

        int[] union = ArraysUnion(a, b);

       
        System.out.print("Union: ");
        for (int value : union) {
            System.out.print(value + " ");
        }
    }
}
