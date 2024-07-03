package Queue_19;
//------------------------------------------------------Implementation Queue Using  LinkedList-------------------------------------------//
public class Q_03 {
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    static class LQueue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the Queue is empty");
                return -1;
            }
            int front=head.data;
            if(head==tail){
             head=tail=null;
            }else{
                head=head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
            System.out.println("the Queue is empty");
            return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        LQueue LQ=new LQueue();
        LQ.add(2);
        LQ.add(3);
        LQ.add(4);
        while(!LQ.isEmpty()){
          System.out.println(LQ.peek()+" ");
          LQ.remove();
        }
    }
}
