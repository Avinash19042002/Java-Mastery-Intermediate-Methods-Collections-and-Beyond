import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Assignment2 {
    public static void main(String[] args) {
        HashMap<String,Integer> students= new HashMap<>();
        Scanner scanner= new Scanner(System.in);

         while(true){
             System.out.println("Enter your choice:\n1 : Add New Student\n2: Get the score of a student\n3: Exit\n");
             int choice=scanner.nextInt();
             scanner.nextLine();
             String name;

             switch (choice){
                 case 1:
                     System.out.println("Enter Name of the student");
                     name=scanner.nextLine();
                     System.out.println("Enter Score of "+name);
                     Integer score=scanner.nextInt();
                     students.put(name,score);
                     System.out.println("\n");
                     break;

                 case 2:
                       System.out.println("Enter Name of the student");
                       name=scanner.nextLine();
                       Integer studentScore= students.get(name);
                       if(studentScore!=null){
                           System.out.println("Score of "+name+" is: "+studentScore);
                       }
                       else System.out.println("Student with name as "+name +" is not found!!");
                       System.out.println("\n");
                       break;
                 case 3:
                     System.out.println("Exiting...");
                     scanner.close();
                     System.exit(0);
                 default:
                     System.out.println("Invalid Input!! Try Again.");
                     System.out.println("\n");

             }

         }

    }
}
