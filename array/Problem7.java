// Intersection of two sorted arrays
package array;

import java.util.Vector;

public class Problem7 {
    static Vector<Integer> ArrayIntersection(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;

        Vector<Integer> ans = new Vector<>();
        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 7};
        int[] b = {1, 2, 3, 6, 7, 8, 9};
        
        Vector<Integer> result = ArrayIntersection(a, b);  // ✅ corrected

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
