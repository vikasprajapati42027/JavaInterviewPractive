package org.example.interviewtest;

public class Test1 {

//1
// 23
// 456
// 78910

    public static void main(String[] args) {
        int count=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
