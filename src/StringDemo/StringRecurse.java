package StringDemo;

public class StringRecurse {
    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        System.out.println(remPart2(s,part));
        System.out.println(s);
    }
    static String remPart(String s, String part){
        while(s.contains(part)){
            int index=s.indexOf(part);
            s=s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }

    static String remPart2(String s,String part){
//        String p="";
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(part)){
            return remPart2(s.substring(part.length()),part);
        }else{
            return s.charAt(0)+remPart2(s.substring(1),part);
        }
    }
}
