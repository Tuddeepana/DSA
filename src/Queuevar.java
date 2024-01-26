import java.util.LinkedList;
import java.util.Queue;

public class Queuevar {


    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Orange");
        queue.add("Mango");
        queue.add("WaterMellon");
        System.out.println("Queue :"+queue);

        String front = queue.remove();
        System.out.println("Front element : " +front);

        System.out.println("Now Queue :" +queue);


        System.out.println("Queue Peek :"+queue.peek());
        System.out.println("After peek :" +queue);

        System.out.println("Check Queue is Empty :"+queue.isEmpty());


    }
}
