package InterviewQuestions;

public class NumberToString {
    public static void main(String[] args) {
    int x=1100;
    int y=5;
        System.out.println(numberToString(x,y));


    }

    public static StringBuilder numberToString(int x,int y){
        int sum=add(x,y);
        int mul=multi(x,y);
       //    convert to String
        String sumStr=Integer.toString(mul);
//    map no to the word
        String[] digitToWord={"zero","one","two","three","four","five","six","seven","eight","nine"};

        StringBuilder result=new StringBuilder();
        for(char c:sumStr.toCharArray()){
            int num=Character.getNumericValue(c);
            result.append(digitToWord[num]);
        }

        return result;
    }
    public static int add(int x,int y){
        int z=x+y;
        return z;
    }
    public static int multi(int x,int y){
        int z=x*y;
        return z;
    }

    }


