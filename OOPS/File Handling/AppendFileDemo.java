import java.io.*;
class AppendFileDemo{
    public static void main(String[] args){
        try{
        FileWriter fw = new FileWriter("student.txt",true);
        fw.write("\nWelcome to java");
        fw.close();
        System.out.println("Data appended succesfully");
        }
        catch(IOException e){
            System.out.println("An error occured");
        }

    }
}