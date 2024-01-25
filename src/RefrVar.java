public class RefrVar {
    int value=50;

    RefrVar(){


        int i = 10;
        System.out.println("Value "+i);

        int x = i;
        System.out.println("Check: "+ x);

        value = x;
        System.out.println("Add value Reference :"+ i);



    }


    public static void Check(){
        RefrVar refrVar = new RefrVar();
        System.out.println("Reference value "+refrVar.value);



    }

}


