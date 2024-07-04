package Queue_19;
//--------------------------------------------------Implementation of  Queue Using Two Stack-----------------------------------------------
import java.util.*;

public class Q_04 {
    static class Queue{
      static Stack<Integer> s1=new Stack<>();
      static Stack<Integer> s2=new Stack<>();
        public static boolean isempty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isempty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
       return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue Q=new Queue();
        Q.add(2);
        Q.add(3);
        Q.add(4);
         while(!Q.isempty()){
            System.out.println(Q.peek()+" ");
            Q.remove();
         }

    }
}
