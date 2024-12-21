package StringDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class StringQuestions{
    public static void main(String[] args) {
    String str="Jayaprakash";
        System.out.println(fancyString(str));

        System.out.println(Arrays.toString(removeDuplicates(str)));
    }
    static String fancyString(String s){
        StringBuffer result=new StringBuffer();

        for(int i=0;i<s.length();i++){
            int len=result.length();
            if(len>=1 && result.charAt(len-1)==s.charAt(i)){
                continue;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    //Q:removeDuplicates
    static int[] removeDuplicates(String s){
        s=s.toLowerCase();
        int[] charCount = new int[26];
        for(char ch:s.toCharArray()){
            charCount[ch-'a']++;
        }

        Stack<Character> stack=new Stack<>();

        boolean[] inStack=new boolean[26];
        for(char ch:s.toCharArray()){
            charCount[ch-'a']--;

            if(inStack[ch-'a']){
                continue;
            }

            while(!stack.isEmpty() && stack.peek()>ch && charCount[stack.peek()-'a']>0){

            }
        }



        return charCount;
    }

//    static String minwindow(String s,String t){
//        if(s.length()<t.length()){
//            return "";
//        }
//
//        HashMap<Character,Integer> charCountT= new HashMap<>();
//        for(char c:t.toCharArray()){
//            charCountT.put(c,charCountT.getOrDefault(c,0)+1);
//        }
//        int required = charCountT.size();
//        int formed=-0;
//
//        HashMap<Character,Integer> charCountWindow=new HashMap<>();
//
//        int left=0,right=0;
//        int minLength=Integer.MAX_VALUE;
//        int minWindow=0;
//
//    }
}
