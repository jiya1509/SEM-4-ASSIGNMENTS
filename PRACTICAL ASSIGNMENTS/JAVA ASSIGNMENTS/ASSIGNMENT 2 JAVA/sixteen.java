import java.util.*;
public class sixteen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println(" enter 1 string : ");
        list.add(sc.nextLine());
        System.out.println(" enter 2 string : ");
        list.add(sc.nextLine());
        System.out.println(" enter 3 string : ");
        list.add(sc.nextLine());
        System.out.println(" enter 4 string : ");
        list.add(sc.nextLine());
        
        LinkedList<String> newItems = new LinkedList<>();
        System.out.println(" enter new 1 string : ");
        newItems.add(sc.nextLine());
        System.out.println(" enter new 2 string : ");
        newItems.add(sc.nextLine());
        System.out.println();

        list.addAll(newItems);
        System.out.println(" Final Linkedlist is : " +list);
        System.out.println();
        System.out.println();
        System.out.println(" enter string to add at first : ");
        list.addFirst(sc.nextLine());
        System.out.println(" after add at first the linklist is : : " +list);
        System.out.println();
        System.out.println();

//  Retrieving and displaying element at index 2
        if (list.size() > 2) {
            System.out.println("Element at index 2: " + list.get(2));
        } else {
            System.out.println("List size is less than 3, cannot find element at index 2.");
        }
        System.out.println();

        // Finding the last index of a user input string
        System.out.println("Enter the string to find its last index: ");
        String searchString = sc.nextLine();
        int lastIndex = list.lastIndexOf(searchString);
        if (lastIndex != -1) {
            System.out.println("Last index of '" + searchString + ": " + lastIndex);
        } else {
            System.out.println(" " + searchString + "  not found in the list !");
        }
    }
}