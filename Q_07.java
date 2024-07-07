package Queue_19;
import java.util.*;
//-------------------------------------------------------InterLeave Two Halves Of A Queue------------------------------------------------------
public class Q_07 {
    public static void InterLeave(Queue<Integer> q){
       Queue<Integer>firstHalf=new LinkedList<>();
       int n=q.size();
       for(int i=0;i<n/2;i++){
        firstHalf.add(q.remove());
       } 
       while(!firstHalf.isEmpty()){
        q.add(firstHalf.remove());
        q.add(q.remove());
       }
    } 
    //------------------------------------------------------------Reversed A Queue------------------------------------------------------------------------- 
       public static void reverse(Queue<Integer>q){
          Stack<Integer> st=new Stack<>();
          while(!q.isEmpty()){
            st.push(q.remove());
          }
          while(!st.isEmpty()){
            q.add(st.pop());
          }
       }
     
    
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
      /*   InterLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek() +" ");
            q.remove();
        }*/
        System.out.println("The Reversed Queue is :");
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() +" ");
        }
    }
    
}
