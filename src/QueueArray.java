public class QueueArray {

    private static  int[] queue = new int[8];
    private static int start =0;
    private static int rear=0;

    public static void main(String[] args) {



        for (int i=0; i<queue.length; i++){
            queue(i+1);

        }
        System.out.println(queue[0]);
        System.out.println(queue[1]);


        System.out.println("queue deque");
        deque();
        System.out.println(queue[0]);


        printQueue();

    }

    private static void queue(int i) {
        if(rear<queue.length){
            queue[rear++]=i;
        }else {
            System.out.println("Queue Full");
        }
    }

    private static void deque(){
        if(start<rear){
            start++;
        }else {
            System.out.println("Queue Empty");
        }
    }
    private static void printQueue() {
        for (int i = start; i < rear; i++) {
            System.out.println(queue[i]);
        }
        System.out.println();
    }








    }




