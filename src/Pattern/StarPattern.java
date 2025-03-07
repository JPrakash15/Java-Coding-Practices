package Pattern;

public class StarPattern {
    public static void main(String[] args){

        int n=6;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
    }
//    *****
//    *****
//    *****
//    *****
//    *****
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    *
//    **
//    ***
//    ****
//    *****
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    *****
//    ****
//    ***
//    **
//    *
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    1
//    12
//    123
//    1234
//    12345
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
    static void pattern5(int n){
        for(int i=1;i<n*2;i++){
            int c=i>n?(n-(i-n)):i;
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    *    *
//    **  **
//    ******
//    ******
//    **  **
//    *    *
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            int c=i>n/2?n-i+1:i;
            int s=n-2*c;
            for (int j=1;j<=c;j++){
                System.out.print("*");
            }
            for (int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
