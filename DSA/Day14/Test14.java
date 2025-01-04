package Day14;

import java.util.Stack;

import Day13.Test13;

// Implementing Queue using stack
public class Test14 {
    private Stack<Integer> main;
    
    private Stack<Integer> temp;
    public Test14(){
        main = new Stack<>();
        temp = new Stack<>();

    }
    public void Push(int x){
        while (main.size() > 0) {
            temp.push(main.pop());

        }
        main.push(x);
        while (temp.size() > 0) {
            main.push(temp.pop());
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
