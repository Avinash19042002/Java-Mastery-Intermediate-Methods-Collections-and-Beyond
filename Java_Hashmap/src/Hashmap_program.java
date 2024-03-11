import java.util.HashMap;
public class Hashmap_program {
    public static void main(String[] args) {
        // creation of HashMap
        HashMap<String,String> capitalCities = new HashMap<String,String>();

        // adding key value pair in HashMap
        capitalCities.put("England","London");
        capitalCities.put("India","Delhi");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("USA","NY");

        System.out.println(capitalCities);

        // Accessing an item from HashMap
        System.out.println(capitalCities.get("India"));

        //Remove an item from HashMap
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //loop through a HashMap
        //keySet() ---> getting only Keys
        //values() ---> getting only values

        //loop through the keys
        for(String i: capitalCities.keySet()){
            System.out.println(i);
        }

        // to get keys & values loop through
        for(String i:capitalCities.keySet()){
            System.out.println("Key: "+i+", value: "+capitalCities.get(i));
        }
    }
}
