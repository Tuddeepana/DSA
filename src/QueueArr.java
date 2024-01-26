public class QueueArr {

    public static void main(String[] args) {
        int i =0;

        int []ar = new int[] {1,2,3,4};
        for (i=0; i<ar.length; i++){
            System.out.println("Get value one by One :"+ i+":: "+ar[i]);

        }

        if (ar==null){
            System.out.println("Empty");

        }
        else {
            System.out.println("Not null");
        }

        System.out.println("Get first value :" +ar[0]);






    }
}
