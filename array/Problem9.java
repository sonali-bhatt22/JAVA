// Maximum Consicutive ones
package array;

public class Problem9 {
    static int FindMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                max = Math.max(max, count);


            }else{
                count = 0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int [] nums = {1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1};
        int maxCons = FindMaxConsecutiveOnes(nums);
        System.err.println(maxCons);

        
    }
    
}
