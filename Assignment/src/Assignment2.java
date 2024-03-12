import java.util.Scanner;
import java.util.ArrayList;
public class Assignment2 {
    public static void main(String[] args) {
      ArrayList<String> students= new ArrayList<String>();
      Scanner scanner= new Scanner(System.in);

      while(true){
          System.out.println("Enter your choice:\n1: Add New Student\n2: Remove a Student\n3: Get the list of students\n4: Exit\n");
          int choice=scanner.nextInt();
          scanner.nextLine();
          switch (choice){
              case 1:
                  System.out.println("Enter Name of student to added");
                  String name = scanner.nextLine();
                  if(students.contains(name)){
                      System.out.println("Student with name "+name +" Already Exists!!");
                  }
                  else{
                      students.add(name);
                      System.out.println(name+" has been Added Successfully!!");
                  }
                  System.out.print("\n");
                  break;
              case 2:
                  System.out.println("Enter Name of the student to be removed");
                  String studentName= scanner.nextLine();
                  if(students.contains(studentName)){
                      students.remove(studentName);
                      System.out.println("Student with name "+studentName +" has been removed successfully!!");
                  }
                  else{
                      System.out.println("student with name "+studentName+" does not exists");
                  }
                  System.out.print("\n");
                  break;
              case 3:
                  System.out.println("List of students:");
                  System.out.println(students);
                  System.out.println();
                  break;
              case 4:
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
