package org.example.collections.practice.Date20240204;

import java.io.File;

public class FilePathNewFileCreate {
    public static void main(String[] args)  throws  Exception{
        File file=new File("/home/ahm-l-vikaspr/Resume/Jobs/Text1.txt");
        if(file.createNewFile())
        {
            System.out.println("File created");
        }
        else {
            System.out.println("File not created");
        }
    }
}
