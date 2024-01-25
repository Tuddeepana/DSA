public class RefrVar {
    int value=1000;

    RefrVar(){


        int i = 10;
        System.out.println("Value "+i);

        int x = i;
        System.out.println("Check: "+ x);



    }


    public static void Check(){
        RefrVar refrVar = new RefrVar();
        System.out.println("Reference value "+refrVar.value);

    }

}


