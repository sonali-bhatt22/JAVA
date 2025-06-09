// find a number which appears only once im an aaray

package array;

public class Problem10 {
    static int NumberAppearsOnce(int[] a, int n){
        
        for(int i = 0; i<n; i++){
            int num = a[i];
            int count  = 0;
            for(int j = 0; j<n; j++){
                if(a[j] == num){
                    count++;
                }
                
            }
            if(count == 1) return num;

        }
        return 0;
        
    }
    public static void main(String[] args) {
        int[] a =  {1, 1, 2, 2, 3, 3, 4, 4, 4, 5};
        int n = a.length;
        int number = NumberAppearsOnce(a, n);
        System.out.println(number);
    }
    
}
