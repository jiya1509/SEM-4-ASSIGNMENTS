import java.util.*;
// import java.util.Collections;
public class fifteen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        
        System.out.println(" array list is : " +list);
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Contains 8: " + list.contains(8));
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}