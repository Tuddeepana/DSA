import java.util.ArrayList;

public class DynamicArr {


    public static void main(String[] args) {

        //Array
        /*
         * we must define how many elements we add  before
         * the adding when implementation */


        int[] ar = new int[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i+1;


            System.out.println(ar[i]);

        }
        //Array List - Java
        //Vectors - C++

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        System.out.println(al);



    }

}
