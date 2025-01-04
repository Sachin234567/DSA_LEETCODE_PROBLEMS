package Day3;

public class Nth_Fibb {
    public static int Test(int x){
        if (x == 0 || x == 1) {
            return x;
        }
        int n1 = 0;
        int n2 = 1;
        for(int i = 1; i<=x;i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
    public static void main(String[] args) {
        int num = Test(5);
        System.out.println(num);
    }
}
