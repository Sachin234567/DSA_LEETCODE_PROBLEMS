//Boat to Save People
package Day18;

import java.util.Arrays;

public class Test18 {
    public static int numRescue(int[] People, int limit) {
        Arrays.sort(People);
        int start = 0;
        int end = People.length - 1;
        int count = 0;
        while (start <= end) {
            if ((People[start] + People[end]) <= limit) {
                start++;
                end--;
            } else {
                end--;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 6 };
        int limit = 3;
        int result = numRescue(nums, limit);
        System.out.println(result);

    }
}
