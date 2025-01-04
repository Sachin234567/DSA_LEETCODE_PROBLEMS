package Day11;

//import java.util.PriorityQueue;
//import java.util.Arrays;
import java.util.PriorityQueue;

public class Test11 {
    
    
//Method 1:
    // public static int findKthLargest(int[] nums, int k) {
    //     Arrays.sort(nums); // Sorts the array in ascending order
    //     return nums[nums.length - k]; // Return the k-th largest element
    // }

    // public static void main(String[] args) {
    //     int[] nums = { 3, 2, 1, 5, 6, 4 };
    //     int k = 4;
    //     System.out.println("The " + k + "-th largest element is: " + findKthLargest(nums, k));
    // }
        public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);  // Min-heap of size k
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest element when the heap size exceeds k
            }
        }
        return minHeap.peek();  // The root of the min-heap is the k-th largest element
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "-th largest element is: " + findKthLargest(nums, k));
    }

}


