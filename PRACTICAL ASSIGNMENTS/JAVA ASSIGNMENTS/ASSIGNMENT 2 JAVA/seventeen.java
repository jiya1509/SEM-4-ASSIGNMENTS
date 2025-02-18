import java.util.*;
public class seventeen {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println(" enter 1 value  : ");
        stack.push(sc.nextInt());
        System.out.println(" enter 2 value  : ");
        stack.push(sc.nextInt());
        System.out.println(" enter 3 value  : ");
        stack.push(sc.nextInt());
        System.out.println(" enter 4 value  : ");
        stack.push(sc.nextInt());
        System.out.println(" enter 5 value  : ");
        stack.push(sc.nextInt());
        System.out.println(" the stack is : " +stack);

        System.out.println("Peep (top element): " + stack.peek());
        System.out.println("Pop (removed element): " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println(" enter a number for search : ");
        int n = sc.nextInt();
        int Search = stack.search(n);
        System.out.println("Search for element "+n+" found at inedx : "+Search);
    }
}