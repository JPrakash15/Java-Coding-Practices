import java.util.Arrays;

public class Arrayquestions {
    public static void main(String[] args) {
        int[] nums={2,1,3,3,4};
        System.out.println(Arrays.toString(runningArrrays(nums)));
        int[] arr={1,2,1};
        System.out.println(Arrays.toString(buildDoubleArray(arr)));
        int[] ar={1,2,3,4};
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
}
