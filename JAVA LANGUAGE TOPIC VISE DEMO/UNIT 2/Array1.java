import java.util.*;
public class Array1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter how much elements you want : ");
        int a = sc.nextInt();
        int ar[] = new int[a];
        for(int i=1;i<=a;i++)
        {
            System.out.println(" Enter a value : ");
            ar[i] = sc.nextInt();
        }
        for(int i=1;i<=a;i++)
        {
            System.out.println(ar[i]);
        } 
    }
}
