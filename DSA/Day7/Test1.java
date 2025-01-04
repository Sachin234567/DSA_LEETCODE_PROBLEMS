public class Test1 {
    public int[] SearchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        if (nums.length == 0) {
            return res;
        }
        res[0] = firstOccur(nums, target);
        res[1] = lastOccur(nums, target);
        return res;
    }

    public  int firstOccur(int[] nums, int t) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (nums[m] == t) {
                ans = m;
                e = m - 1;
            } else if (t > nums[m]) {
                s = m + 1;
            }

            else {
                e = m - 1;
            }
        }
        return ans;

    }
    
    public int lastOccur(int[] nums, int t) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (nums[m] == t) {
                ans = m;
                s = m + 1;
            } else if (t > nums[m]) {
                s = m + 1;
            }

            else {
                e = m - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Test1 obj = new Test1();
        int[] arr = {5,7,7,8,8,9};
        int target = 8;
        System.out.println("Array:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] result = obj.SearchRange(arr, target);
        for (int i = 0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }

}
