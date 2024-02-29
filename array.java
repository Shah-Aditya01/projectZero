package projectZero;

import java.util.Scanner;

public class array {

    // To make array
    public static void makearray(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // To print the array
    public static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    // To reverse array
    public static void swapelements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reversearray(int[] arr, int i, int j){
        while(i<j){
            swapelements(arr,i,j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        makearray(arr,n);
        printarray(arr);
        reversearray(arr,0,arr.length-1);
        System.out.println();
        printarray(arr);
    }
}
