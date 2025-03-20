package QueueDemo;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        int[] ropes={2,7,6,2};
        System.out.println(minCostToConnection(ropes));
    }

    static int minCostToConnection(int[] ropes){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int totalCost=0;
        for(int rope:ropes){
            minHeap.add(rope);
        }
        while(minHeap.size()>1){
            int first=minHeap.poll();
            int second=minHeap.poll();
            int cost=first+second;
            totalCost+=cost;
            minHeap.add(cost);
        }

        return totalCost;
    }

}
