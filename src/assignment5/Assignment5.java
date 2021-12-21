package assignment5;
import java.util.Scanner;
public class Assignment5
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String name;
        double num1 , num2;
        
        System.out.println("Enter the operation name.");
        name = input.next();
        System.out.println("Enter the first number.");
        num1 = input.nextDouble();
        System.out.println("Enter the second number.");
        num2 = input.nextDouble();
        
        Big_decimal number1 = new Big_decimal(num1);
        Big_decimal number2 = new Big_decimal(num2);
        Divider_Adapter DA1 = new Divider_Adapter();
        DA1.Operation(name, number1, number2);
    }
}
