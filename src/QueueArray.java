public class QueueArray {

    private static  int[] queue = new int[8];
    private static int start =0;
    private static int rear=0;

    public static void main(String[] args) {

        System.out.println("Array length: " + queue.length);

        // Add data to the queue
        for (int i = 0; i < queue.length; i++) {
            enqueue(i + 1);
        }

        System.out.println("Queue elements:");
        printQueue();

        // Remove an element from the front of the queue and print the removed element
        System.out.println("Removed element: " + dequeue());

        System.out.println("Queue elements after removal:");
        printQueue();
    }
    private static void enqueue(int data) {
        if (rear < queue.length) {
            queue[rear++] = data;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + data);
        }
    }

    // Method to print the elements of the queue
    private static void printQueue() {
        for (int i = start; i < rear; i++) {
            System.out.println(queue[i]);
        }
        System.out.println();
    }


    // Method to remove an element from the front of the queue and return the removed element
    private static int dequeue() {
        int removedElement = -1; // Default value if the queue is empty
        if (start < rear) {
            removedElement = queue[start++];
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        return removedElement;
    }






}




