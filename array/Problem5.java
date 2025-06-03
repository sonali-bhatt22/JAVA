//Addition of two arrays
package array;

public class Problem5 {
    static int[] AddingArray(int[] arr1, int[] arr2, int[] newArray){
        int newArrayIndex = arr1.length + arr2.length;
        int[] newArr = new int[newArrayIndex];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        return newArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] newArr = new int[0];
        newArr = AddingArray(arr1, arr2, newArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    
}
