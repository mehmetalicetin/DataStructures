package com.cetin.data;

public class InsertionSort {

    //https://www.geeksforgeeks.org/insertion-sort/
    void sort(int []arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i){

            int key = arr[i];
            int j = i-1;

             /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */

            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j]; // listenin elemanlarını kaydırıyor.
                j = j - 1;
            }

            arr[j+1] = key; //ilk başa geldi.
            printArray(arr);
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}
