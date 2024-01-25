public class ArrayVar {
    //int i =0; //Instance Variable
    ArrayVar(){

        int [] a = new int[5];


        for(int i=0; i<a.length; i++){
            int x = a[i]=i+1;

            System.out.println("Array :"+ x);

        }

    }

}
