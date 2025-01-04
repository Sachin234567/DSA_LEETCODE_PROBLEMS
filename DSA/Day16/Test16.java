package Day16;

public class Test16 {
    public  static int FindDuplicate(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            ele  = Math.abs(ele);
            if (nums[ele] > 0) {
                nums[ele] = - nums[ele];
            }
            else {
                ans = ele;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int res = FindDuplicate(arr);
        System.out.println(res);
    }
    
}
