package Day4;

public class Target_Sum {
    public static void Sum(int[] arr,int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length;j++){
                if ((arr[i] + arr[j]) == target) {
                    System.out.println(i + " ," + j);
                    break;
                }
            }
        }


    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,6,8};
        int target = 9;
        Sum(arr, target);
    
    }
}
