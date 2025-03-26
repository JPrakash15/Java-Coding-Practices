import java.util.ArrayList;
import java.util.List;

public class MathsForDSA {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(primeNum(27));
        int n = 23;
        boolean[] bool = new boolean[n + 1];
        seive(n);
        System.out.println();
        System.out.println(GCD(70, 28));
        System.out.println(consecutiveGCD(70, 28));
        System.out.println(binaryLength(10));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static List<Integer> primeNum(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    static void seive(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static int GCD(int a, int b) {
//        int c=0;
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    static int consecutiveGCD(int a, int b) {
        int t = Math.min(a, b);
        while (t >= 1) {
            if (a % t == 0 && b % t == 0) {
                return t;
            } else {
                t--;
            }
        }
        return 1;
    }

    static int binaryLength(int n) {
        int[] binLen = new int[32];
        int i = 0;
        while (n >= 1) {
            binLen[i] = n % 2;
            i++;
            n = n / 2;
        }
        return i;
    }
}
