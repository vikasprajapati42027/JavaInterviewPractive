package org.example.collections.practice.Date20231202;

public class StringBuilderreverse {

    public static void main(String[] args) {
        String str="vikasprajaptati";
        String str1=new StringBuilder(str).reverse().toString();
       // System.out.println(str1);

        String st="vikas prajapti from Neemuch";
        String words[]=st.split("\\s");


        for(String word:words)
        {
            String w=new StringBuilder(word).reverse().toString();
            System.out.print(w);
            System.out.println(" ");
        }
    }
}
