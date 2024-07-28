package org.example.collections.practice.lamdaExpretionDate20240723;

public class HomeAdd {
    public static void main(String[] args) {

        Store store=(arr)->{
          int sum=0;
          for(int x:arr)
          {
              sum+=x;
          }
          return sum;
        };

        int arr[]={1,2,3,4,5};
        System.out.println(store.add(arr));
    }
    interface Store
    {
        int add(int[] arr);
    }
}
