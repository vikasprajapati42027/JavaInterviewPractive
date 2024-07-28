package org.example.collections.practice.Date20240526TutorialDSA.Array.sorting;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 8, 2, 7};
        int minIndex = -1;
        for (int i = 0; i < 6 - 1; i++) {
            minIndex = i;
            for (int j = i; j < 6; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }
}
