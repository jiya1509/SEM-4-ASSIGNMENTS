// 7. Write a Java Program that take one number from user making use of
// JoptionPane class, pass it to the parameterised Constructor and check
// whether its Odd number or Even number
import javax.swing.JOptionPane;
public class seventh {
    seventh(int a)
    {
        if(a%2==0)
        {
            System.out.println(" number is even");
        }
        else
        {
            System.out.println(" number is odd");
        }
    }
    public static void main(String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Enter A : "));
        seventh S = new seventh(a);
    }
}
