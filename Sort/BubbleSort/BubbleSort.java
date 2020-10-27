/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seth
 */
public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int i, j, temp;
        int n = arr.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) {
                break;
            }
        }
    }
    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver program 
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
        bubbleSort(arr);
        printArray(arr);
    }
}
