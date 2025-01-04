
package Day6;

//import java.util.*;
public class Test {
    public static int[] SortedSquares(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int left = 0 , right = n-1;
        int pos = n-1;
        while (left <= right) {
            int lSq = nums[left] * nums[left];
            int rSq = nums[right] * nums[right];
            if(lSq >= rSq){
                res[pos--] = lSq;
                left++;
            }
            else {
                res[pos--] = rSq;
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int[] result = SortedSquares(arr);
        System.out.println("Sorted Square Array");
        for(int i = 0;i < result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
