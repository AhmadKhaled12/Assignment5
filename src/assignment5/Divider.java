package assignment5;
import java.util.Scanner;
public class Divider implements Divide_Interface
{
    public Scanner input = new Scanner(System.in);
    @Override
    public Big_decimal Divide(Big_decimal number1,Big_decimal number2)
    {
        System.out.println("Enter the first number.");
        number1.number = input.nextDouble();
        System.out.println("Enter the second number.");
        number2.number = input.nextDouble();
        Big_decimal result = new Big_decimal(number1.number / number2.number);
        System.out.println(result.number);
        return result;
    }
}
