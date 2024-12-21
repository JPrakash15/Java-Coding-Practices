package ArraysDemo;

import java.util.Arrays;

public class RBS {
    public static void main(String[] args){
        int[] arr={7,8,1,2,3,4,5,6};
        System.out.println(search(arr,6,0, arr.length-1));
        System.out.println(Arrays.toString(RotateArray(arr,3)));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return search(arr,target,s,m-1);
            }
            else{
                return search(arr,target,m+1, e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return search(arr, target, m+1,e);
        }else{
            return search(arr,target,s, m-1);
        }

    }

    static int[] RotateArray(int[] arr, int k){
        if(arr.length==0) return arr;
        k=k%arr.length;
        if(k==0) return arr;
        reverse(arr,k,0, arr.length-1);
        reverse(arr,k,0, arr.length-k);
        return reverse(arr,k,arr.length-k+1, arr.length-1);
    }
    static int[] reverse(int[] arr, int k, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }
}
