public class QueueArray {


    public static void main(String[] args) {

        int [] queue = new int[8];


        System.out.println("Array length :" +queue.length);

        //add the data
        for(int i=0; i<queue.length; i++){

            System.out.println(queue[i]=i+1);

        }






        System.out.println("Queue Deque order reverse");
        //Deque Queue
        for(int k=queue.length-1; k>=0; k--){
            System.out.println(queue[k]);
        }















    }



}
