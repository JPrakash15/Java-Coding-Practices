package QueueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> q= new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(5);
        q.add(15);
        System.out.println(q);
    }
}
