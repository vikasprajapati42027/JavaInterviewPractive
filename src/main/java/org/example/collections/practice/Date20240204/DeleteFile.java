package org.example.collections.practice.Date20240204;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/ahm-l-vikaspr/Resume/Jobs/file");
//        if(file.delete())
//        {
//            System.out.println("File deleted successfully");
//        }else if(file.exists())
//        {
//            System.out.println("File not available");
//        }
//        else {
//            System.out.println("File not deleted");
//        }
        //Files of the files #####################################################
//        String files[]=file.list();
//        Arrays.sort(files);
//        for(String f:files)
//        {
//
//            System.out.println(f);
//        }

        //Directory list
        File f2[]=file.listFiles();
        Random rand=new Random();
        System.out.println(f2.length);

        for(int i=0;i<5;i++)
        {

            File file1=new File("/home/ahm-l-vikaspr/Resume/Jobs/file/"+"file_"+rand.nextInt(99999-10000)+10000+".txt");
            if(file1.createNewFile())
            {
                System.out.println("File created");
                System.out.println(file1.getName());
            }
            else {
                System.out.println("File not created");
            }


        }
    }
}
