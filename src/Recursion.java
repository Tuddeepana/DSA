public class Recursion {

    public static void main(String[] args) {
        System.out.println("Normal "+req(5));

        System.out.println("Recursive " + recursiveFunction(5));


    }

    //Normal Function
    static int req(int x) {
        int answer = 1;

        while (x>0){
            answer = answer * x;
            x--;

        }
        return answer;
    }

    //Recursive Function

    static  int recursiveFunction(int r){

        if(r<=1){
            return 1;
        }
        return  r* recursiveFunction(r-1);



    }

}
