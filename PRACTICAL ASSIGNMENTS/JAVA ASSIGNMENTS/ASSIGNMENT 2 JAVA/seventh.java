// Write a Java Program to create an array containing marks of all students in physics using 
// a for-each loop
import java.util.*;
public class seventh {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number of students : ");
        int Student = sc.nextInt();
        int marks[] = new int[Student];
        for(int i=0;i<Student;i++)
        {
            System.out.println(" enter a marks for "+(i+1)+" student for physics : ");
            marks[i] = sc.nextInt();
        }

        System.out.println(" the marks of "+Student+" in physics is : ");

        for(int mark : marks)
        {
            System.out.println(mark);
        }
    }
}
