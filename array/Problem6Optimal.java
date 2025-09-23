//union of two arrays Optimal Solution
package array;

import java.util.Arrays;

public class Problem6Optimal {
    static int[] Union(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0, k = 0;
        int[] unionArr = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (k == 0 || unionArr[k - 1] != a[i]) {
                    unionArr[k++] = a[i];
                }
                i++;
            } else if (b[j] < a[i]) {
                if (k == 0 || unionArr[k - 1] != b[j]) {
                    unionArr[k++] = b[j];
                }
                j++;
            } else {
                // a[i] == b[j]
                if (k == 0 || unionArr[k - 1] != a[i]) {
                    unionArr[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (k == 0 || unionArr[k - 1] != a[i]) {
                unionArr[k++] = a[i];
            }
            i++;
        }

        while (j < n2) {
            if (k == 0 || unionArr[k - 1] != b[j]) {
                unionArr[k++] = b[j];
            }
            j++;
        }

        return Arrays.copyOf(unionArr, k);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 7};
        int[] b = {1, 2, 3, 8, 9, 10};

        int[] unionArr = Union(a, b);
        for (int i = 0; i < unionArr.length; i++) {
            System.err.println(unionArr[i]);
            
        }
    }
    
}
