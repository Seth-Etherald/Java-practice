/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seth
 */
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    static void insertionSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
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
        insertionSort(arr);
        printArray(arr);
    }
}
