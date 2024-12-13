package Recursion;

public class Recursion {
    public static void main(String[] args) {
        int[] unSortArr={2,6,3,8,18,9,16};
        int[] sortArr={1,3,6,9,13,14,99};
        System.out.println(find(unSortArr,18,0));
        System.out.println(isSorted(sortArr,0));
        System.out.println(isSorted(unSortArr,0));
    }
//    Q1:Find an elament in unsorted array
    static boolean find(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr,target,index+1);
    }

//    Q2:Check array if sorted or not
    static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }

}
