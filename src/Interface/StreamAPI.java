package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 2, 1 ,6, 7,4);
        Stream<Integer> data = nums.stream();
//        long lebgth = data.count();
//        System.out.println(lebgth);
//        Function<Integer, Integer> mapped = (Integer i) -> {
//                 return i = i*1;
//
//            };
        //input:5,2,1,6,7,4
        int num = nums.stream().filter(n->(n&1)==1).sorted().map(i->i*2).reduce(0,(c,e)->c+e);
        System.out.println(num); //output:26
    }
}
