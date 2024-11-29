import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int year2=sc.nextInt();
        int num=sc.nextInt();

        //multiplication table for input n
        numMultiplyTable(num);
        //add two nos
        System.out.println("sum of two nums"+sum(year, year2));

        if (isLeapYear(year)) {
            System.out.println(year + " is leap Year");
        } else {
            System.out.println(year + " Not a Leap Year");
        }
        sc.close();


    }
        // is leap year or not
        public static boolean isLeapYear ( int n){
            if (n % 4 == 0) {
                if (n % 100 == 0) {
                    return n % 400 == 0;
                }
                return true;
            }
            return false;
        }
        //sum of two nos
        public static int sum(int a, int b){
        return a+b;
        }
        // multiplication table for a input number
        public static void numMultiplyTable(int n){
        for(int i=1;i<=20;i++){
            System.out.println(i*n);
        }
        }
}
