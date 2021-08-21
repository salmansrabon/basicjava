package FileRead_Write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleRead_Write {
    public static void main(String[] args) throws IOException {
        fileWrite();
        fileRead();
    }
    public static void fileWrite() throws IOException {
        FileWriter fw=new FileWriter("MyFile.txt",true);
        fw.write("\nHello Everybody");
        fw.close();
    }
    public static void fileRead() throws IOException {
        FileReader reader = new FileReader("MyFile.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}
