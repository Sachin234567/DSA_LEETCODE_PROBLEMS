package Day9;

public class Test9 {
    public static int SearchInsert(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int res = SearchInsert(arr, 2);
        System.out.println("The Position for inserting the element is:"+res);
    }
}
