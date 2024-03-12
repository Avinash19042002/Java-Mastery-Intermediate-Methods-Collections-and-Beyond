import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_program {
    public static void main(String[] args) {
        // ArrayList creating for Collection
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("PineApple");

        // Getting an Iterator
        Iterator<String> item= fruits.iterator();

        // Print the first item from the list of items
        System.out.println(item.next());

        // loop through of iterator
        while(item.hasNext()){
            System.out.println(item.next());
        }


        //removing items from Collections

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(500);
        arr.add(200);
        arr.add(100);
        arr.add(90);
        arr.add(50);

        System.out.println(arr);

        Iterator<Integer> num= arr.iterator();
        while(num.hasNext()){
            Integer i= num.next();
            if(i<100){
                num.remove();
            }
        }

        System.out.println(arr);
    }
}
