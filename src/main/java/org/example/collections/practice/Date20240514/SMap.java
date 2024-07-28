package org.example.collections.practice.Date20240514;

import java.util.*;

public class SMap{

    public int firstt(int arr[],int n,int x)
    {
        int low =0;int high=n-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(x>arr[mid])
            {
                low=mid+1;
            }else if(x<arr[mid])
            {
                high=mid-1;
            }else
            {
                if(mid==0||arr[mid-1]!=arr[mid])
                {
                    return mid;
                }else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Map<String, String> smap = new LinkedHashMap<>();
        Student s = new Student(101, "vikas", "M.P.");

        List<String> list = new ArrayList<>();
            list.add(String.valueOf(s));


        System.out.println(list);

        s.setId1(Integer.parseInt("101"));
        s.setName("prajapati");
        s.setAddress("Neemuch");

     //   list.add(s.getId(),"101");
      //  list.add(102,s.getName());
    //    list.add(103,s.getAddress());
        //smap.put("101",s.getId1());
        smap.put("102",s.getName());
        smap.put("103",s.getAddress());
        for(Map.Entry smap1: smap.entrySet())
        {
            System.out.println("key is : " + smap1.getKey() + " value is : "+ smap1.getValue());
        }


    }
}
