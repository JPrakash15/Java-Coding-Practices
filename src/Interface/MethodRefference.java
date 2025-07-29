package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
    String parse(String str);
}
class StringParser{
    public static String parse(String s){
        if(s.length()>=5){
            s=s.toLowerCase();
        }else {
            s=s.toUpperCase();
        }
        return s;
    }
}
class MyPrinter{
    public void print(String str, Parser p){
        str=p.parse(str);
        System.out.println(str);
    }
}

public class MethodRefference {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("Mohan", "Priya", "Chandru");

    names.forEach(System.out::println);



    }
}
