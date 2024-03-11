import java.util.ArrayList;
import java.util.Collections; // this library is having Sorting Algorithms
public class ArrayList_Program {
    public static void main(String[] args) {
        //ArrayList Declaration
      ArrayList<String> fruits= new ArrayList<String>();
      fruits.add("Mango");
      fruits.add("Banana");
      fruits.add("Papaya");
        System.out.println(fruits);
        int n= fruits.size();
       // Accessing an element at a index -Using get(index)  method

        for(int i=0;i<n;i++) System.out.println(fruits.get(i));

        // Changing an item at a particular index using .set(index,new_item) method
        fruits.set(0,"Kiwi");
        System.out.println(fruits);

        //removing an iterm at index i - using remove(i)
//        fruits.remove(0);
//        System.out.println(fruits);

        // Empty the whole ArrayList - Using clear()
//        fruits.clear();
//        System.out.println(fruits);

        //get the size of arraylist -using size() method
        System.out.println("size of the ArrayList is: "+fruits.size());

        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println(fruits);


        // Loop through the ArrayList
        fruits.add("Apple");
        for(int i=0;i<fruits.size();i++) System.out.print(fruits.get(i)+" ");

        System.out.print("\n");
        //for each loop for iterating over an ArrayList
        for(String i:fruits) System.out.print(i+" ");

        System.out.print("\n");
        Collections.sort(fruits);// method to sort the ArrayList
        for(String i:fruits) System.out.print(i+" ");

        System.out.println();
        // ArrayList does not support primitive datatype  so provide datatype in the form of class
        // for int provide Integer
        ArrayList<Integer> marks= new ArrayList<Integer>();
        marks.add(89);
        marks.add(96);
        marks.add(95);
        marks.add(92);
        Collections.sort(marks);
        for(Integer x:marks) System.out.print(x+" ");
    }
}
