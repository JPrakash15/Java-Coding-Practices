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
        System.out.println(list==list);

        System.out.println(findAllIndex2(ssortArr,6,0));
        System.out.println(countPath(3,4));
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
    static ArrayList findAllIndices(int[] arr, int target, int index, ArrayList list){
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
    static ArrayList findAllIndex2(int[] arr, int target, int index){
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
//    Q:find the no of paths
    static int countPath(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left=countPath(r-1,c);
        int  right=countPath(r,c-1);
        return left+right;
    }
}
