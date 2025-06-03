package array;

public class ArrayRotate {

    public static int[] LeftRotateByOne(int [] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i <n; i++){ 
            arr[i - 1] = arr[i];

        }
        arr[ n-1] = temp;
        return  arr;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LeftRotateByOne(arr);
        for(int i = 0; i<arr.length; i++){
            System.err.println(arr[i]);

        }
        
    }
}
