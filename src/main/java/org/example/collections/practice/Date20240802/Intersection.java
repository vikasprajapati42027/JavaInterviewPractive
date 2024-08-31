package org.example.collections.practice.Date20240802;

public class Intersection {

    static void intersection(int x[],int y[])
    {
        int []z=new int[x.length+y.length];
        for(i=0;i <(x.length);i++)
        {
            for(j=0;j < y.length;j++)
            {
                if(x[i]==y[j])
                {
                    z[c]=x[i];

                    c++;
                }

                else
                    continue;

            }
        }
        System.out.println("Intersection of two  array is " +"  ");
        for(k=0;k < c;k++)
        {
            System.out.print("  "+z[k]+" ");
        }
        System.out.println("            ");
    }
    public static void main(String[] args) {

        int[] x= {2,5,3,7};
        int[] y={5,2,9,0,1};
    } static int i,j,k,c=0;
}
