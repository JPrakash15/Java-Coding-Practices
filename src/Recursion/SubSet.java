package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        String str="abc";
        String sub="";
        int[] nums={1,2,2};
        skip(str,sub);
//        System.out.println(skip(str));

        String str1="bcaabcbcd";
        System.out.println(skipApple(str1));
        subSeq(sub,str);
        System.out.println("\n"+subSeqList(sub,str));
        subSeqAscii(sub,str);
        System.out.println("\n"+subSeqAsciiList(sub,str));
        System.out.println(subSet(nums));
        System.out.println("hello");
        System.out.println(subSetDuplicates(nums));
    }
    static String skip(String up){
        String p="";
        if(up.isEmpty()){
            return "";
        }
        char c=up.charAt(0);
        if(c=='a'){
            return skip(up.substring(1));
        }else{
           return  p+c + skip(up.substring(1));
        }
    }
    static void skip(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(up.substring(1),p);
        }else{
            skip(up.substring(1),p+ch);
        }
    }

    static String skipApple(String up){
        String p="";
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skip(up.substring(1));
        }else{
            return p+skip(up.substring(1));
        }
    }

    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subSeqList(p+ch,up.substring(1));
        ArrayList<String> right=subSeqList(p,up.substring(1));

        left.addAll(right);
        return left;
    }
//
    static void subSeqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+(ch+0),up.substring(1));
    }
//
    static ArrayList<String> subSeqAsciiList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subSeqAsciiList(p+ch,up.substring(1));
        ArrayList<String> right=subSeqAsciiList(p,up.substring(1));
        ArrayList<String> center=subSeqAsciiList(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(center);
        return left;
    }
//
    static List<List<Integer>> subSet(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for(int num:nums){
            int n= result.size();
            for(int i=0;i<n;i++){
                List<Integer> inner =new ArrayList<>(result.get(i));
                 inner.add(num);
                 result.add(inner);
            }
        }

        return result;
    }
//
    static List<List<Integer>> subSetDuplicates(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start,end=0;
        for(int i=0;i<nums.length;i++){
            start=0;
//
            if(i>0 && nums[i]==nums[i-1]){
                start=end+1;
            }

            end=outer.size()-1;
            int size=outer.size();
            for(int j=start;j<size;j++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
