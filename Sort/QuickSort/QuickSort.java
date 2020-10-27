/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seth
 */
public class QuickSort {

    //Pick a pivot
    static int partition(int arr[], int low, int high) 
    { 
        //Pick the last element as pivot
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    static void quickSort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high);  
            // Recursively sort elements before 
            // partition and after partition 
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high); 
        } 
    } 

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Driver code
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int n, lim;
        int[] arr;
        System.out.println("Input Limit value of Array: ");
        lim = Integer.parseInt(in.nextLine());
        System.out.println("Input Number of elements in Array: ");
        n = Integer.parseInt(in.nextLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(lim);
        }
        System.out.println("Array pre-sorted: ");
        printArray(arr);
        System.out.println();
        System.out.println("Array post-sorted: ");
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
