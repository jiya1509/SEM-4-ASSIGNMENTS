import java.util.*;
public class third {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double Gsalary,Nsalry,Hrate,n,tax;
        System.out.println(" enter the number of worked : ");
        n = sc.nextDouble();
        System.out.println(" enter hour rate : ");
        Hrate = sc.nextDouble();
        Gsalary = Hrate * n;
        System.out.println(" Gross salary is : " +Gsalary);
        System.out.println(" enter tax : ");
        tax = sc.nextDouble();
        Nsalry = Gsalary - tax*0.075;
        System.out.println(" net salary is : " +Nsalry);
    }
}
