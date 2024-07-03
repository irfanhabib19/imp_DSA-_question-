package Queue_19;
//-----------------------------------------------------------Implementation Queue Using Array----------------------------------------------------------//
public class Q_01 {
    static  class Queue{
      static   int[]arr;
      static   int size;
      static int rare;
      Queue(int n){
        arr=new int[n];
        size=n;
        rare=-1;
        }
      public static boolean isEmpty(){
            return rare==-1;
        }
      public static void Add(int data){
        if(rare==size-1){
            System.out.print("the Queue is full");
            return;
            }
        rare=rare+1;
        arr[rare]=data;    

        }
      public static int remove(){
        if(isEmpty()){
            System.out.print("the Queue is empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rare;i++){
          arr[i]=arr[i+1];
        }
        rare=rare-1;
        return front;
      }  
      public static int peek(){
        if(isEmpty()){
            System.out.println("the Queue is empty");
            return -1;
        }
        return arr[0];
      }
    }
    public static void main(String[] args) {
    Queue Q=new Queue(5);
    Q.Add(5);
    Q.Add(6);
    Q.Add(7);
    while(!Q.isEmpty()){
        System.out.print(Q.peek()+" ");
        Q.remove();
    }
     
    }

    }

