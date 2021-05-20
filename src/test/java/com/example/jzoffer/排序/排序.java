package com.example.jzoffer.排序;

import java.util.Vector;

/**
 * @Author: cola
 * @Created: cola on 2021/3/8 22:38
 * @Version 1.0
 */
public class 排序 {

      public 排序() {
    }

    public static void main(String[] args) {
        int a[] = {4,78,96,23,1,48,45,32};

        //insertSort3(a);

       // insertSort2(a);

       // insertSort3(a);
        quickSort7(a,0,a.length-1);
      //  shellSort(a);

      //  shellSort2(a);

        for (int i = 0;i <a.length;i++ ){
            System.out.println(a[i]);
        }
    }

    //冒泡 O(n2) O(1)
     void insertSort(int arr[]){
        boolean flag = false;
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                        int t = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = t;
                }
            }
            flag = true;
        }

        if (!flag){
            return ;
        }
    }

   static void insertSort4(int arr[]){
       for (int i = 0; i < arr.length-1; i++) {
           boolean flag = false;
           for (int j = 0; j < arr.length -i -1; j++) {

               if (arr[j] > arr[j+1]){
                   int t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
                   flag = true;
               }
           }

           if (!flag){
               return;
           }
       }
    }

    /**
     * 选择排序
     * @param arr O(n2) O(1)
     */
    static void insertSort2(int arr[]){

        for(int i = 0;i<arr.length-1;i++){
            int k = i;
            for (int j = i+1;j<arr.length;j++){

                if (arr[k]>arr[j]){
                    k = j; //纪录最小值
                }
            }
            //与最小值交换
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }

    /**
     * 选择排序
     */
    static void insertSort5(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <=arr.length-1; j++) {
                if (arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    /**
     * 插入排序
     * @param arr O(N2) O(1)
     */
    static void insertSort3(int arr[]){

       for (int i = 1; i<arr.length;i++){

           int temp = arr[i];
           int k = i-1;
           while (k >= 0 && arr[k] > temp){
               k--;
           }
           for (int j = i; j > k+1; j--){
               arr[j] = arr[j-1];
           }

           arr[k+1] = temp;
       }

    }

    static void insertSort6(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i-1;
            while (k >= 0 && arr[k] > temp){
                k--;
            }
            for (int j = i; j > k+1; j--) {
                arr[j] = arr[j-1];
            }
              arr[k+1] = temp;
        }
    }



    /**
     * 快速排序
     * @param a O(nlogn) o
     */
    static void quicksort(int a[],int left, int right) {
        int i, j, t, temp;
        if(left > right)
            return;
        temp = a[left]; //temp中存的就是基准数
        i = left;
        j = right;
        while(i != j) { //顺序很重要，要先从右边开始找
            while(a[j] >= temp && i < j)
                j--;
            while(a[i] <= temp && i < j)//再找右边的
                i++;
            if(i < j)//交换两个数在数组中的位置
            {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        //最终将基准数归位
        a[left] = a[i];
        a[i] = temp;
        quicksort(a,left, i-1);//继续处理左边的，这里是一个递归的过程
        quicksort(a,i+1, right);//继续处理右边的 ，这里是一个递归的过程
    }


    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int gap = arr.length/2; gap > 0;gap /= 2) {
            for (int i = gap;i < arr.length;i++) {
                for (int j = i - gap;j >= 0 ; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }

    static void quickSort7(int arr[],int left ,int right){

        int i = left;
        int j = right;
        int temp = arr[left];
        if(left > right)
            return;
        while(i != j) { //顺序很重要，要先从右边开始找
            while(arr[j] >= temp && i < j)
                j--;
            while(arr[i] <= temp && i < j)//再找右边的
                i++;
            if(i < j)//交换两个数在数组中的位置
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;
        quicksort(arr,left,i-1);
        quicksort(arr,i+1,right);

    }

    /**
     * 希尔排序
     */
    final void shellSort2(int arr[]){
        int t =0;
        for (int gap = arr.length;gap>0;gap/=2){
            for (int i = gap;i<arr.length;i++){
                for (int j = i -gap;j>=0;j-=gap){
                    if (arr[j] > arr[j + gap]) {
                        t = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = t;
                    }
                }
            }
        }

    }


}
