import java.util.*;
public class nineth {
    
    // Constructor for the triangle area
    nineth(double base, double height) {
        double AOT = 0.5 * base * height;
        System.out.println("Area of triangle is: " + AOT);
    }

    // Constructor for the rectangle area
    nineth(int height, int width) {
        int AOR = height * width;
        System.out.println("Area of rectangle is: " + AOR);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for the triangle
        System.out.println("Enter base for triangle (A): ");
        int a = sc.nextInt();
        System.out.println("Enter height for triangle (B): ");
        int b = sc.nextInt();
        nineth N1 = new nineth(a, b);  // Triangle area

        // Input for the rectangle
        System.out.println("Enter height for rectangle (X): ");
        int x = sc.nextInt();
        System.out.println("Enter width for rectangle (Y): ");
        int y = sc.nextInt();
        nineth N2 = new nineth(x, y);  // Rectangle area
    }
}
