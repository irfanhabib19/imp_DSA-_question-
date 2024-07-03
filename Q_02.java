package Queue_19;
//--------------------------------------------------Implementation of circular Queue using Array----------------------------------------------------------------------//
public class Q_02 {
    static class CQueue{
        static int rear;
        static int size;
        static int front;
        static int[] arr;
        CQueue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }
        public static boolean isEmpty(){
               return front==-1 && rear==-1; 
        }
        public static boolean isFull(){
            return (rear+1)%size== front;
        }
        public static void Add( int data){
           if(isFull()){
            System.out.println("the CQueue is full");
            return;
           }
           if(front==-1){
            front=0;
           }
           rear=(rear+1)%size;
           arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the CQueue is empty");
                return -1;
            }
            int result=front;
            if(front==rear){
                front=rear=-1;
            }else{
              front=(front+1)%size;
            }
            return arr[result];
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the CQueue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        CQueue CQ =new CQueue(4);
        CQ.Add(1);
        CQ.Add(2);
        CQ.Add(3);
       System.out.println( CQ.remove());
        CQ.Add(4);
        System.out.println(CQ.remove());
        CQ.Add(5);
        while(!CQ.isEmpty()){
            System.out.println(CQ.peek() +" ");
            CQ.remove();
        }

    }
}
