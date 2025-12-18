package day_16;

import java.io.FileReader;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("largefile.txt");
        int ch;

        long start = System.currentTimeMillis();
        while ((ch = reader.read()) != -1) {
           
        }
        long end = System.currentTimeMillis();

        reader.close();
        System.out.println("FileReader Time: " + (end - start) + " ms");
    }
}
