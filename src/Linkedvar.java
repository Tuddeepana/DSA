import java.util.LinkedList;

public class Linkedvar {

    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<>();
        car.add("Ferrari");
        car.add("Bmw");
        car.add("Lamborghini");

        car.remove(1);
        car.add("Benz");

        car.addFirst("KO");

        car.add(0,"Mustang");
        String x=car.peek();
        System.out.println(x);

        System.out.println(car);

    }
}
