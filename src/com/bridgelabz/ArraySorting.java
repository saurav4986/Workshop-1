package com.bridgelabz;

public class ArraySorting {

    public static void main(String[] args) {

        int arr [] = new int[] {5,2,8,1,6};
        int temp =0;
        System.out.println("Element in original array");
        for (int i : arr){
            System.out.print(i + "\t");
        }
        for (int j=0;j<arr.length;j++){
            for (int k=j+1;k<arr.length;k++){
                if (arr[j]<arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements after sorting it in descending order");
        for (int i : arr){
            System.out.print(i+"\t");
        }
    }
}