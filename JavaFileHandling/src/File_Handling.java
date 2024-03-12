import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File_Handling {
    public static void main(String[] args) {
//         try{
//             File myobj = new File("myfile.txt");
//             if(myobj.createNewFile()){
//                 System.out.println("File Created: "+myobj.getName());
//             }
//             else{
//                 System.out.println("File Already Exists");
//             }
//         }catch(IOException e){
//             System.out.println("An Error Occurred");
//             e.printStackTrace();
//        }

        // Writing a file
//        try{
//            FileWriter myWriter = new FileWriter("myfile.txt");
//            myWriter.write("Avinash is very Intelligent and is an iitian");
//            myWriter.close();
//            System.out.println("Successfully written to file");
//        }catch (IOException e){
//            System.out.println("Error Occurred");
//            e.printStackTrace();
//        }

        // Read a file

//        try{
//            File myfile = new File("myfile.txt");
//            Scanner myReader = new Scanner(myfile);
//            while(myReader.hasNextLine()){
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        }catch(FileNotFoundException e){
//            System.out.println("Error Raised");
//            e.printStackTrace();
//        }

        // Getting File Information

//     File myObj= new File("myfile.txt");
//        if(myObj.exists()){
//            System.out.println("FileName: "+myObj.getName());
//            System.out.println("Absolute path: "+myObj.getAbsolutePath());
//            System.out.println("Readable: "+myObj.canRead());
//            System.out.println("Writeable: "+myObj.canWrite());
//            System.out.println("Executable: "+myObj.canExecute());
//            System.out.println("Size of the file in bytes: "+myObj.length());
//
//        }
//        else System.out.println("file not found!!");


        // deleting a file
//        File myObj1= new File("myfile.txt");
//        if(myObj1.delete()){
//            System.out.println("File Deleted Successfully "+myObj1.getName());
//        }
//        else{
//            System.out.println("File Not found... or set correct path");
//        }


        //Deleting a Directory
        File myObj= new File("D:\\5th sem notes\\MyJavaTest");
        if(myObj.delete()){
            System.out.println("Directory Deleted Successfuuly..."+myObj.getName());
        }
        else{
            System.out.print("Directory Not found... ");
        }
    }
}
