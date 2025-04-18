package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        int[] unSortArr={2,6,3,8,18,9,16};
        int[] sortArr={1,3,6,9,13,14,99};
        int[] ssortArr={1,2,6,3,6,4,3,9,8,3};
        System.out.println(find(unSortArr,18,0));
        System.out.println(isSorted(sortArr,0));
        System.out.println(isSorted(unSortArr,0));
        System.out.println(findIndex(unSortArr,18,6));

        findAllIndex(ssortArr,3,0);
        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        findAllIndices(ssortArr,3,0,list);

        System.out.println(list);

        System.out.println(findAllIndex2(ssortArr,6,0));
//        System.out.println(countPath(3,4));

        System.out.println(fibo(10));
        fiboSeries(10);
    }
//    Q1:Find an element in unsorted array
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

//  Q3:Find the index of the target
static int findIndex(int[] arr, int target, int index){
        if(index<=-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index-1);
    }


    static List<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){

        if(index==arr.length){
            return;
        }

        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

//    Q: Return all the indices of target in list
    static List<Integer> findAllIndices(int[] arr, int target, int index, List<Integer> list){
//        List<Integer> list2=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndices(arr,target,index+1,list);
    }
//    Q:Return thr list dont take it in the argument
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index== arr.length){
            return list;
        }
//      this will contain ans for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow= findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }

//    Q:generate fibonacci series
    static int fibo(int n){
        if(n<=1){
            return n;
        }else{
            return fibo(n-2)+fibo(n-1);
        }
    }

    static void fiboSeries(int n){
        for(int i=0;i<n;i++){
            if(i<=1){
                System.out.println(i);
            }else{
                System.out.println(fibo(i-2)+fibo(i-1));
            }
        }
    }

}
