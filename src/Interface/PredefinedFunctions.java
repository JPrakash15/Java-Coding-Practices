package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class ConsImpl implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.println(i);
    }
}
public class PredefinedFunctions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> isEven = n -> (n&1)==0;



        list.stream()
                .filter(isEven) //Predicate
                .forEach(System.out::println);
        Predicate<Integer> p = i -> (i>-10)&&(i<10);
        System.out.println(p.test(9));
        System.out.println(p.test(-10));

        List<String> words = Arrays.asList("Java", "Pyhton", "Ai", "C++","Kotlin");

        Function<String, Integer> strToLentgh = String::length;

        List<Integer> length = words.stream().map(strToLentgh).toList();
        System.out.println(length);

        words.stream().map(strToLentgh)
                .forEach(System.out::println);
        List<String> mails = Arrays.asList("test@gmail.com", "EXAMPLE@yahoo.in", "DeltaEnergy@co.in","Happy.com");

        Predicate<String> isValoidMail = email -> email.matches("[^@]+@\\w+\\..+");

        mails.stream()
                .filter(isValoidMail)
                .forEach(System.out::println);

        list.forEach(System.out::println);  //Consumer
    }
}
