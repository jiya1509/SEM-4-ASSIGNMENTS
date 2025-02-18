import javax.swing.JOptionPane;
public class sixth {
    public static void main(String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Enter A : "));
        if((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0 ))
        {
            System.out.println(" its a leap year!");
        }
        else
        {
            System.out.println(" it is not a leap year");
        }
    }
}
