package org.example.collections.practice.lamdaExpretionDate20240723;

public class HomeGenericFunction {
    public static void main(String[] args) {
        Store<Integer> store=(arr)->{
            int sum=0;
            for(Integer x:arr)
            {
                sum+=x;
            }
            return sum;
        };

        Integer arr[]={1,2,3};
        System.out.println(store.get(arr));
    }
    interface Store<T> {
        T get(T[] arr);
    }

}
