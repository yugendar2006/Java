import java.util.*;
import java.io.*;
class CountLines{
    public static void main(String[] args){
        try{
            File f = new File("Student.txt");
            Scanner sc = new Scanner(f);
            int count = 0;
            while(sc.hasNextLine()){
                sc.nextLine();
                count++;
            }
            sc.close();
            System.out.println("Number of lines: " + count);
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}