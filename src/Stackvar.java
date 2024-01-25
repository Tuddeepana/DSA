import java.util.Stack;

class Test{
    static void stack_push(Stack<Integer> stack){
        for(int i=0; i<5; i++){
            stack.push(i);

        }

    }

}



public class Stackvar {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i=0; i<5; i++){
            stack.push(i+1);
        }

        System.out.println(stack);

        System.out.println("Stack Pop :" +stack.pop());
        System.out.println("Stack after pop :" +stack);

        System.out.println("Retry push :"+ + stack.push(99));
        System.out.println("Now Stack :" +stack);


        System.out.println("Stack peek :"+ stack.peek());
        System.out.println("Now Stack"+ stack);

        System.out.println("Stack Search "+ stack.search(3));
        stack.clear();
        System.out.println("After Clear :"+stack);




    }



}
