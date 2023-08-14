public class task2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;

        int a = nums[0];
        int b = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>a){
                a = nums[i];
            }else if(nums[i]<b){
                b=nums[i];
            }
        }
        System.out.println("smallest number="+b);
        System.out.print("Largest number="+a);
    }
}
