package Hackerrank;


import java.util.*;

public class PoisnousPlants {
    public static void main(String[] args){
        System.out.println("plants");
        List<Integer> plants=new ArrayList<>(Arrays.asList(4,3,7,5,6,4,2));
    System.out.println(poisnousPlants(plants));
    }
    public static int poisnousPlants(List<Integer> p) {
        Stack<int[]> index = new Stack<>();
        int maxDays = 0;

        for (int plant : p) {
            int days=0;

            while(!index.isEmpty() && index.peek()[0] <= plant){
            days=Math.max(days,index.pop()[1]);
            }
            if(index.isEmpty()){
                days=0;
            }else{
                days++;
            }
            maxDays=Math.max(maxDays,days);
            index.push(new int[]{plant,days});
        }
        return maxDays;
    }
}


