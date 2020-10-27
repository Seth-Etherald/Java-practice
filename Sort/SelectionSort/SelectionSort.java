/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seth
 */
public class SelectionSort {
    static void selectionSort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    /*Driver Code*/
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
        selectionSort(arr);
        printArray(arr);
    }
}
