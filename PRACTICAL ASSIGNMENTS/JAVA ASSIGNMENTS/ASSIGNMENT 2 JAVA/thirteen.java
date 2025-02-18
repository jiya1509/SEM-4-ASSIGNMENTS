import java.util.*;
public class thirteen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        System.out.println(" the stack is : " +stack);
        int min = stack.peek();
        for (int value : stack) 
        {
            if (value < min) 
            {
                min = value;
            }
        }
        System.out.println("Minimum value in stack: " + min);
    }
}