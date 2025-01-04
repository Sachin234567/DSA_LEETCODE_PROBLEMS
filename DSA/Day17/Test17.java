package Day17;

// To find Pivot index
public class Test17 {
    public static int FindPivot(int[] nums) {
        int rsum = 0;
        for (int ele : nums) {
            rsum += ele;
        }
        int lsum = 0;
        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];
            if (rsum == lsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 30, 50, 10, 60, 20, 40 };
        int res = FindPivot(arr);
        System.out.println("The Pivot Index is:" + res);

    }
}
