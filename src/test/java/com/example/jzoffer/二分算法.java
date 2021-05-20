package com.example.jzoffer;

/**
 * @Author: cola
 * @Created: cola on 2021/3/6 10:24
 * @Version 1.0
 */
public class 二分算法 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(binarySearch(arr,12));

    }



    public static int binarySearch(int arr[],int data){
        int low = 0;
        int height = arr.length-1;

        while (low<=height){

            int mid = low + (height-low)/2;
            if (data<arr[mid]){
                height = mid-1;
            }else if (data == arr[mid]){
                return mid;
            }else {
                low =mid+1;
            }
        }

        return -1;
    }
}


