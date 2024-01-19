import java.io.*;

public class main
{
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("test1.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
