package Day2;

public class Power_Of_2 {
    public static boolean Test(int x){
        if (x<0) {
            return false;
        }
        else if (x == 1) {
            return true;
        
        }
        else{
            while (x % 2 == 0) {
                x = x/2;
            }
            if (x == 1) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        boolean b = Test(14);
        System.out.println(b);
    }
    
}
