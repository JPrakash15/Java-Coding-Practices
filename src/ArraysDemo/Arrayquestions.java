package ArraysDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayquestions {
    public static void main(String[] args) {
        int[] nums={3,6,12,5};
        System.out.println(Arrays.toString(runningArrrays(nums)));
        int[] arr={1,2,1};
        System.out.println(Arrays.toString(buildDoubleArray(arr)));
        int[] ar={1,2,3,4};
//        System.out.println(Arrays.toString(remDup(nums)));
        List<Integer> p = new ArrayList<>(Arrays.asList(4, 3, 7, 5, 6, 4, 2));
        System.out.println("Plants");
        System.out.println(poisnousPlants(p));
        System.out.println(isGoodArray(nums));

    }

    public static int[] runningArrrays(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=nums[0];
        for(int i=1;i<n;i++){
            ans[i]=nums[i-1]+nums[i];
        }
        return ans;
    }

    public static int[] buildDoubleArray(int[] nums){
    int n=nums.length;
    int[] ans=new int[2*n];
    for(int i=0;i<n;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];
    }
    return ans;
    }
    public static int[] buildArray(int[] nums){
        int n= nums.length;
        int[] ans= new int[n];
        for(int i=0; i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

    static int[] remDup(int[] nums){
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        int[] uniArray=new int[j+1];
        int index=0;
        for(int i=0;i< nums.length;i++){
            if(i==0 || nums[i]!=nums[i+1]){
            uniArray[index++]=nums[i];
            }
        }
        return uniArray;
    }

    public static int poisonousPlants(List<Integer> p) {
        // Write your code here\
        int days=0;
        int j=0;
        for(int i=1;i<p.size();i++){
            if(p.get(i)>p.get(j)){
                j++;
            }else{
                p.remove(j);
                j++;
                days++;
            }
        }

        return days;
    }

    public static int poisnousPlants(List<Integer> p){
        int j=0,days=0;
        for(int i=1;i<p.size();i++){
            if(p.get(j)<p.get(i)){
                p.remove(i);
                j++;
                days++;
            }else{
                j++;
            }

        }
        return days;
    }
//    static void minMaxSum(int[] arr){
//        int minSum,maxSum,j,sum=0;
//
//        for(int i=0;i<arr.length-1;i++){
//            sum+=arr[i];
//        }
//        if(sum)
//    }
    static boolean isGoodArray(int[] arr){
        int result =arr[0];
        for(int i=1;i<arr.length;i++){
            result= gcd(result,arr[i]);

            if(result==1){
                return true;
            }
        }
        return result==1;
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
