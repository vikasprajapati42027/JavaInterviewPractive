package org.example.collections.practice.Date20240126;

public class evenlengthString {
    public static String evenlength(String str)

    {
        int c=0;
        String words[]=str.split(" ");
        StringBuffer sb=new StringBuffer();

        for(String word:words)
        {
            if(word.length()%2==0)
            {
                sb.append(word).append(" ");

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="my name is vikas prajapati THis is my code";
        System.out.println(evenlength(str));
    }
}
