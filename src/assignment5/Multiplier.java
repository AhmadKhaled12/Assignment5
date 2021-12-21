package assignment5;
public class Multiplier implements Multiply_Interface
{
    @Override
    public Big_decimal Multiply(Big_decimal number1,Big_decimal number2)
    {
        Big_decimal result = new Big_decimal(number1.number * number2.number);
        System.out.println("The multiplication result of " + number1.number + " & " + number2.number + " = " + result.number);
        return result;
    }
    
}
