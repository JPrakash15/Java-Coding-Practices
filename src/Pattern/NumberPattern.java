package Pattern;

public class NumberPattern {
    public static void main(String[] args) {
        int n=6;
        pattern1(n);
    }
//    1
//    12
//    123
//    1234
//    12345
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
