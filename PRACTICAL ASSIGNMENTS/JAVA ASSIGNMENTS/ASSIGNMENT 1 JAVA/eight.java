import java.util.*;

public class eight {
    // Constructor to check if the number is prime
    eight(int a) {
        if (a <= 1) 
        {
            System.out.println("Number is not prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= a / 2; i++)
         { // Check divisors from 2 to a/2
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        new eight(a); // Create an instance of the class
    }
}
