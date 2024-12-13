public class BitWise {
    public static void main(String[] args) {
        int num=68;
        System.out.println(findOddEven(num));

        int[] nums={3,3,3,9,4,4,4,5,5,5};
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

        System.out.println(findUniqueNum(nums));
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

    static int findUniqueNum(int[] nums){
        int[] bitCount=new int[32];
        int unique=0;
        for(int num:nums){
            for(int i=0;i<32;i++){
                if((num &(1<<i))!=0){
                    bitCount[i]++;
                }
            }
        }
        for(int i=0;i<32;i++){
            if(bitCount[i]%3!=0){
                unique=unique|(1<<i);
            }
        }

        return unique;
    }
}
