package Day13;

//import java.lang.reflect.Array;
import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Queue;

public class Test13 {
    private Queue<Integer> main;
    private Queue<Integer> temp;
    public Test13(){
        main = new ArrayDeque<>();
        temp = new ArrayDeque<>();
    }
    public  void Push(int x){
        while (main.size() > 0) {
            temp.add(main.remove());
        }
        
        main.add(x);
        while (temp.size() > 0) {
            main.add(temp.remove());
        }
    }
    public void display(){
        
        System.out.println("Stack:");
        for (int s  : main) {
            System.out.print(s + " ");
        }
    }
    
    public static void main(String[] args) {
        Test13 obj = new Test13();
        for(int i = 1;i<=5;i++){
            obj.Push(i);
        }
        obj.display();
    }
    
}
