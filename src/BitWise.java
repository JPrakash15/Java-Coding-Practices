public class BitWise {
    public static void main(String[] args) {
        int num=68;
        System.out.println(findOddEven(num));

        int[] nums={3,3,3,9,4,4,4,5,5,5};
        System.out.println(findUnique(nums));


        int n=8;

        System.out.println(findMagicNum(n));

        System.out.println(findUniqueNum(nums));

        System.out.println(findNumOfDigits(n));

        System.out.println(sumOfnthrow(n));

        printPascalTriangle(n);

        System.out.println(isPowerOf2(n));

        System.out.println(PowerOf(3,6));
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

    // Magical nth number
    static int findMagicNum(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans*=last*base;
            base=base*5;
        }
        return ans;
    }
    static int findNumOfDigits(int n){
        int base=2;
        return (int) (Math.log(n) / Math.log(base)) +1;

    }
    //Q: Sum of nth row in a pascal triangle
    static int sumOfnthrow(int n){
        return (int) Math.pow(2,n-1);
    }

    //Q
    static void printPascalTriangle(int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }


            int value=1;
            for(int j=0;j<=i;j++){
                System.out.print(value+" ");
                value=value * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
    static boolean isPowerOf2(int n){
        return n>0 && (n&(n-1))==0;
    }
    static int PowerOf(int base, int pow){
        int ans=1;
        while(pow>0){
           int n=pow&1;
            pow=pow>>1;
            ans*=base;
            base=base*3;
        }
        return ans;
    }
}
