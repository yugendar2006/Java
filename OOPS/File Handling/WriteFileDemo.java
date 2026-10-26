import java.io.*;
public class WriteFileDemo{
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("Student.txt");
            fw.write("Hello java File Handling");
            fw.close();
            System.out.println("Data written Succesfully");
        }
        catch(IOException e){
            System.out.println("An error occured");
        }
    }
}