import java.io.*;
public class CreateFileDemo{
    public static void main(String[] args){
        try {
            File f = new File("college.txt");

            if(f.createNewFile()){
                System.out.println("File Succesfully Created");
            }
            else{
                System.out.println("File already exists");
            }
        }
            catch(IOException e) {
                System.out.println("An error occured");
            }
        }
    }