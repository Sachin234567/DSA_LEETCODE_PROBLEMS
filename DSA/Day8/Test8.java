package Day8;

public class Test8 {
   public static int SortedSearch(int[] nums, int target){
    int s = 0, e = nums.length-1;
    while (s <= e) {
        int m = (s + e)/2;
        if (nums[m] == target) {
            return m;
        }
        else if (nums[s] <= nums[m]) {
            if (target > nums[s] && target <= nums[m]) {
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        else{
            if (target > nums[m] && target <= nums[e]) {
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
    }
    return -1;
   } 
   public static void main(String[] args) {
    int[] arr = {50,60,70,80,90,10,20,30,40};
    int result = SortedSearch(arr, 20);
    System.out.println("Element Found at :" + result);
   }
}
