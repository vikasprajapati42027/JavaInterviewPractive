package org.example.collections.practice.Date20231202;

public class Permutations {
    public  static  void swap(char[] str,int i,int j)
    {
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
    public static void permutationss(char[] ch,int index)
    {
        if(index==ch.length-1)
        {
            System.out.println("charanter is : "+String.valueOf(ch));
        }
        for(int i1=index;i1<ch.length;i1++)
        {
            swap(ch, index, i1);
            permutationss(ch,index+i1);
            swap(ch,index,i1);
        }
    }
   public static void findpermustations(String str)
   {
       if(str.length()==0 || str==null)
       {
           return;
       }
       permutationss(str.toCharArray(),0);
   }

    public static void main(String[] args) {
        String str="ABC";
        findpermustations(str);

    }


//    class Main
//    {
//        // Utility function to swap two characters in a character array
//        private static void swap(char[] chars, int i, int j)
//        {
//            char temp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = temp;
//        }
//
//        // Recursive function to generate all permutations of a string
//        private static void permutations(char[] chars, int currentIndex)
//        {
//            if (currentIndex == chars.length - 1) {
//                System.out.println(String.valueOf(chars));
//            }
//
//            for (int i = currentIndex; i < chars.length; i++)
//            {
//                swap(chars, currentIndex, i);
//                permutations(chars, currentIndex + 1);
//                swap(chars, currentIndex, i);
//            }
//        }
//
//        public static void findPermutations(String str) {
//
//            // base case
//            if (str == null || str.length() == 0) {
//                return;
//            }
//
//            permutations(str.toCharArray(), 0);
//        }
//
//        // generate all permutations of a string in Java
//        public static void main(String[] args)
//        {
//            String str = "ABC";
//            findPermutations(str);
//        }
//    }
}
