import java.util.Scanner;

public class Admin {
    private int id;
    private String enrollmentNo;
    private String name;

    // Constructor
    public Admin(int id, String enrollmentNo, String name) {
        this.id = id;
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    // Method to input data for an Admin object
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.nextInt();
        // sc.nextLine(); // Consume newline left-over
        System.out.print("Enter Enrollment No: ");
        this.enrollmentNo = sc.nextLine();
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
    }

    // Method to display data of an Admin object
    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Enrollment No: " + this.enrollmentNo);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        // Create an array to store 5 Admin objects
        Admin admins[] = new Admin[5];

        // Create and input data for each Admin object
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Admin " + (i + 1) + ":");
            System.out.println("--------------------------");
            admins[i] = new Admin(0, "", ""); // Initialize with default values
            admins[i].input(); // Input data for the Admin object
        }

        // Display data for all Admin objects
        System.out.println("\nDetails of all Admins:");
        System.out.println("--------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Admin " + (i + 1) + ":");
            admins[i].display(); 
            System.out.println();
        }
    }
}
