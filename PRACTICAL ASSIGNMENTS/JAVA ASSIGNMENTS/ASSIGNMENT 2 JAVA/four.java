//Write a Java Program that will accept a number from the user and calculate
//its square and cube and display the same.
import java.util.*;
class squarecube
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a");
		int a=s.nextInt();
		int square=a*a;
		int cube=a*a*a;
		System.out.println("square is "+square);
		System.out.println("cube is "+cube);
	}
}