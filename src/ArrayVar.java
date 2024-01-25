public class ArrayVar {
    int i =0; //Instance Variable
    ArrayVar(){

        int [] a = new int[5];


        for( i=0; i<a.length; i++){
            int x = a[i]=i+1;

            System.out.println("Array :"+ x);

        }

        int [] arr = new int[]{1,2,3};
        for (i=0; i<arr.length; i++){
            System.out.println("Array 1 "+arr[i]);
        }

    }



}
