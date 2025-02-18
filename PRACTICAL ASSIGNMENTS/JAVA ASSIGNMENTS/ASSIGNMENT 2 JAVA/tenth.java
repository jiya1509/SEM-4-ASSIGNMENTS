public class tenth
{
    public static int add(int... numbers) 
    {
        int sum = 0;
        for (int num : numbers)//for each loop(num is variale and it will go till length of number variable) 
        {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println("Sum of 1, 2, 3: " + add(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, 40, 50: " + add(10, 20, 30, 40, 50));
        System.out.println("Sum of 100, 200: " + add(100, 200));
    }
}