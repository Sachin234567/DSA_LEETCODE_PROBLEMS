//Avg. Salary excluding the minimum and maximum salary
package Day12;

public class Test12 {
    public static double AvgSalary(int[] sal){
        int max = sal[0];
        int min = sal[0];
        int sum = sal[0];
        for(int i = 1;i<sal.length;i++){
            if (max < sal[i]) {
                max = sal[i];
            }
            if (min > sal[i]) {
                min = sal[i];
            }
            sum = sum + sal[i];
        }
        sum = sum - max - min;
        double Avg = (double)(sum / (sal.length-2));
        return Avg;
    }
    public static void main(String[] args) {
        int[] salary = {60,40,70,90,50};
        double res = AvgSalary(salary);
        System.out.println("Average Salary Excluding the minimum and maximum salary:"+res);
    }

}
