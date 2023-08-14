import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int[] arry = new int[nums.length];
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            arry[j] = nums[i];
            
        }
        System.out.print(Arrays.toString(arry));
    }
}
