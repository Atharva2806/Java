//1. Positive, Negative or Zero
//Write a method called checkNumber with an int parameter number.
//The method should not return any value, and it needs to print out:
//"positive" if the parameter number is > 0
//"negative" if the parameter number is < 0
//"zero" if the parameter number is equal to 0
public class Numbercheck
{
    public void checkNumber(int num)
    {
        if (num>0)
        {
            System.out.println("Positive");
        }
        else if (num<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}