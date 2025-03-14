import java.util.ArrayList;
public class playground {
    public static void main(String args[]) {
        ArrayList<Object> array = new ArrayList<>();
        int[] intArray = {1,2,3,4,5};
        array.add(1);
        array.add('c');
        array.add(true);
        array.add(intArray[3]);
        array.add(intArray);
        array.add(0, "denisov is a bad person");
        array.forEach(n->System.out.println(n + " thingy"));
        array.remove(3);
        System.out.println(array.reversed()+ "denisov bad");
        for(Object n : array) System.out.println(n + " I am batman");
    }
}
