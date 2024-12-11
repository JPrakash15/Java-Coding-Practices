public class BitWise {
    public static void main(String[] args) {
        int num=68;
        System.out.println(findOddEven(num));

        int[] nums={3,3,3,3};
        System.out.println(findUnique(nums));


        int n=10;

        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }

        System.out.println(ans);
    }

    static boolean findOddEven(int n){
        return (n&1)==1;
    }

    static int findUnique(int[] arr){
        int unique=0;
        for(int n:arr){
            unique=unique^n;
        }
        return unique;
    }
}
