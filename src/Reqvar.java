public class Reqvar {




    public static void main(String[] args) {

        //This is for loop Recursion
        int x = 5;
        System.out.print("factorial :  ");
        for (int i=x-1; i>=0; i--){

            int d = i+1;


            System.out.print( +d +" * "+i + "  ," );

        }


        /*
        * Normally Recursion expalain by while
        * loop
        * */
        System.out.println();
        System.out.println();

        int j=10;
        int z =0;
        while (j>z){

            z = z * -1;
            System.out.print(j + " *");

            j--;


        }



    }
}
