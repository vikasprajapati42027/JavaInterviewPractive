package org.example.collections.practice.Date20231203;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndFileWriter {
    public static void main(String[] args) {
        try
        {
            FileReader fr=new FileReader("input.txt");
            FileWriter fw=new FileWriter("output.txt");
            int c;
            while((c=fr.read())!=-1)
            {
                fw.write(c);
            }
           fr.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
