package org.example.collections.practice.Date20231202;

public class WordsCOunt {
    public static void main(String[] args) {
       // String str="My name is vikas prajapati I live in neemuch madhya pradesh if you have any quetion ask me i am available here";
        String str="999342 999234 99234 777235 99324 999923";
        String words[]=str.split("\\s");
        int count =0;
        for(String word:words)
        {
            String w=word.toLowerCase();
            if(w.startsWith("99")) {
                count++;
            }

        }
        System.out.println("Number of words is : "+ count);
    }
}
