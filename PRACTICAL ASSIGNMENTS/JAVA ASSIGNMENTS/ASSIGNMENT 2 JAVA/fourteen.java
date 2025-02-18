import java.util.*;
public class fourteen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        System.out.println(" the Priority Queue is : " +pq);
        System.out.println("Minimum value in priority queue: " + pq.peek());
    }
}