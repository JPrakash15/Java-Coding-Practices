import java.util.ArrayList;
import java.util.List;

public class MathsForDSA {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(PrimeNum(27));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
    int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

    static List<Integer> PrimeNum(int n){
        List<Integer> result=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                result.add(i);            }
        }
        return result;
    }
}