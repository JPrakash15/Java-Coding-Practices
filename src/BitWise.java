public class BitWise {
    public static void main(String[] args) {
        int num=68;
        System.out.println(findOddEven(num));

        int[] nums={3,3,3,3};
        System.out.println(findUnique(nums));
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
