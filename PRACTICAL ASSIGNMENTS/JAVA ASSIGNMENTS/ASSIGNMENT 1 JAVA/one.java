import java.util.*;
public class one 
{
    public static void addition()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter A : ");
        int a = sc.nextInt();
        System.out.println(" enter B : ");
        int b = sc.nextInt();
        int add=a+b;
        System.out.println(" addtion is : " +add);
    }
    public static void substraction()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter A : ");
        int a = sc.nextInt();
        System.out.println(" enter B : ");
        int b = sc.nextInt();
        int add=a-b;
        System.out.println(" substration is : " +add);
    }
    public static void mul(int x,int y)
    {
        int mul;
        mul=x*y;
        System.out.println(" multiplication is : " +mul);
    }
    public static void div(int x,int y)
    {
        int div;
        div=x/y;
        System.out.println(" division is : " +div);
    }
    public static void main(String ars[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your choice : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 : addition();
            break;
            case 2 : substraction();
            break;
            case 3 : 
            System.out.println(" enter x : ");
            int x = sc.nextInt();
            System.out.println(" enter y : ");
            int y = sc.nextInt();
            mul(x, y);
            break;
            case 4 :
            System.out.println(" enter a : ");
            int a = sc.nextInt();
            System.out.println(" enter b : ");
            int b = sc.nextInt();
            div(a, b);
            break;
            default: System.out.println(" enter valid choice!");
            break;
        }
    }
}