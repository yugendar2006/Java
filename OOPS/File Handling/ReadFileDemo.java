import java.util.*;
import java.io.*;
class ReadFileDemo{
    public static void main(String[] args){
        try{
            File f = new File("student.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}