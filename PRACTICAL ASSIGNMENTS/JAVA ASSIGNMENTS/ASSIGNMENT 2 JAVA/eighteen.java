// import java.util.*;
// public class eighteen {
//     public static void main(String[] args)
//      {
//         Scanner sc =new Scanner(System.in);
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         System.err.println(" enter 1 value : ");
//         pq.add(sc.nextInt());
//         System.err.println(" enter 2 value : ");
//         pq.add(sc.nextInt());
//         System.err.println(" enter 3 value : ");
//         pq.add(sc.nextInt());
//         System.err.println(" enter 4 value : ");
//         pq.add(sc.nextInt());
//         System.err.println(" enter 5 value : ");
//         pq.add(sc.nextInt());

//         System.out.println(" Priority Queue is : " +pq);

//         System.out.println("Peek (top element): " + pq.peek());
//         System.out.println("Poll (removed element): " + pq.poll());
//         System.out.println("Priority Queue after poll: " + pq);

//         System.out.println(" enter a number for search : ");
//         boolean n = sc.nextBoolean();
//         boolean Contains = pq.contains(n);
//         System.out.println("Contains "+ n +" : " +Contains);
//     }
// }
import java.util.PriorityQueue;
public class eighteen {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(15);
        pq.add(10);
        pq.add(20);
        pq.add(25);

        System.out.println("Peek (top element): " + pq.peek());
        System.out.println("Poll (removed element): " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
        System.out.println("Contains 10: " + pq.contains(10));
    }
}