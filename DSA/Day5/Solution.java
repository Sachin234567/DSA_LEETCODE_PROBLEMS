//In: num = [1,2,0,0] , k = 34 
// Out:[1,2,3,4]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Integer> addToArray(int[] nums , int k){
        List<Integer> res = new ArrayList<>();
        int p = nums.length-1;
        int carry = 0;
        while (p>=0 || k>0) {
            int numVal = 0;
            if (p>=0) {
                numVal = nums[p];
            }
            int d = k % 10;
            int sum = numVal + d + carry;
            int digit = sum % 10;
            carry = sum / 10;
            res.add(digit);
            p--;
            k = k/10;

        }
        if (carry > 0) {
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,0,0};
        int k = 34;
        List<Integer> result = addToArray(arr, k);
        System.out.println("New array after adding the element");
        for (int num  : result) {
            System.out.print(num + " ");
        } 
    }
}
