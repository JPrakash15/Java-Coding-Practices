package Sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[] arr){
        int i =0;
        while(i< arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int index, int correctIndex){
        int temp =arr[correctIndex];
        arr[correctIndex]=arr[index];
        arr[index]=temp;

    }
}
