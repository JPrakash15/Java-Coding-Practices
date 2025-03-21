import java.util.ArrayList;
import java.util.List;

public class MathsForDSA {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(primeNum(27));
        int n=40;
        boolean[] bool = new boolean[n+1];
        seive(n,bool);
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

    static List<Integer> primeNum(int n){
        List<Integer> result=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                result.add(i);            }
        }
        return result;
    }

    static void seive(int n, boolean[] bool) {
        for(int i=2;i*i<n;i++){
            if(!bool[i]){
                for(int j=i*2;j<n;j+=i){
                    bool[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if(!bool[i]){
                System.out.print(i+" ");
            }
        }
    }
}