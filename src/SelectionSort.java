import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr={4,5,0,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for(int i=0;i< arr.length;i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMinIndex(arr, last);
            swap(arr,maxIndex,last);
        }
        return arr;
    }
    public static int getMaxIndex(int[] arr, int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static int getMinIndex(int[] arr, int end){
        int min=0;
        for(int i=0;i<=end;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    public static void swap(int[] arr, int maxIndex, int last){

        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;

    }
}
