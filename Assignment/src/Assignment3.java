import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.FileWriter;

public class Assignment3 {
    public static void main(String[] args) {

        // creation of the file : example.txt
        try {
            File myObj = new File("example.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created successfully: "+myObj.getName());
            }
            else{
                System.out.println("File Already Exists!");
            }
        }catch(IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }

//        writing to the file example.txt
//        try{
//         FileWriter mywriter = new FileWriter("example.txt");
//         mywriter.write("mango banana apple mango pineapple kiwi orange grapes pomegranate");
//         mywriter.close();
//            System.out.println("Successfully written to the file.");
//        }catch(IOException e){
//            System.out.println("Error Occurred..");
//            e.printStackTrace();
//        }

        // creation of HashMap and counting frequencies of each word in the file
        HashMap<String,Integer> wordCounts = new HashMap<String, Integer>();
        try{
            File myObj= new File("example.txt");
            Scanner scanner= new Scanner(myObj);
            // Reading the file line by line
            while(scanner.hasNextLine()){
                String line= scanner.nextLine();//store the current line
                String[] words_in_line=line.split("\\s+");// split the current line into an array of strings
             for(String word:words_in_line){
                if(!word.isEmpty())wordCounts.put(word, wordCounts.getOrDefault(word,0)+1);}
            }
            scanner.close();
            System.out.println("Count of Occurrences of each word in the file "+myObj.getName()+" are :");
            System.out.println("Word\t\tCountOfOccurrences\n");
            for(String word:wordCounts.keySet()){
                System.out.println(word+"\t\t"+wordCounts.get(word));
            }
        }catch(FileNotFoundException e){
            System.out.println("Error Reading File "+e.getMessage());
            e.printStackTrace();
        }
    }
}
