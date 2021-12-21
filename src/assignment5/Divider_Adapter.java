package assignment5;
public class Divider_Adapter extends Multiplier implements Divider_Interface
{
    @Override
    public Big_decimal Divide(Big_decimal number1,Big_decimal number2)
    {
        Big_decimal result = new Big_decimal(number1.number / number2.number);
        System.out.println("The devision result of " + number1.number + " & " + number2.number + " = " + result.number);
        return result;
    }
    public void Operation (String name , Big_decimal number1 , Big_decimal number2)
    {
        Divider_Adapter Adapt = new Divider_Adapter();
        if (name.equalsIgnoreCase("Multiply"))
        {
            Adapt.Multiply(number1, number2);
        }
        else if (name.equalsIgnoreCase("Divide"))
        {
            Adapt.Divide(number1, number2);
        }
        else
        {
            System.out.println("Invalid operation.");
        }
    }
    
    
}
