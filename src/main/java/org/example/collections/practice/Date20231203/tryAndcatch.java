package org.example.collections.practice.Date20231203;

public class tryAndcatch {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int n=10;
        try {
              int arr[]={1,2,3,4,5};
              System.out.println(arr[6]);
        }
        catch (Exception e)
        {
           String s= e.getMessage();
            e.printStackTrace();
            System.out.println(s);
        }
    }
}
