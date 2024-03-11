import java.util.HashSet;
public class HashSet_program {
    public static void main(String[] args) {
        HashSet<String> sports=new HashSet<>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Cricket");
        sports.add("Baseball");
        sports.add("Basketball");
        sports.add("Vollyball");
        System.out.println(sports);

        // check if an item is present in the HashSet or not
        System.out.println(sports.contains("Football"));

        // remove an item from HashSet
        sports.remove("Cricket");
        System.out.println(sports);

        // Empty a HashSet --> Using .clear() Method

        // finding the size of hashset
        System.out.println(sports.size());

        // loop through HashSet
        for(String i:sports){
            System.out.println(i);
        }
    }
}
