public class Recursion {

    public static void main(String[] args) {
        System.out.println(req(5));


    }

    static int req(int x) {
        int answer = 1;

        while (x>0){
            answer = answer * x;
            x--;

        }
        return answer;
    }

}
