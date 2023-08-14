import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

        
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] =temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
