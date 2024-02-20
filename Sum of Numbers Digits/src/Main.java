import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter Number :  ");
        Scanner in= new Scanner(System.in);
        int number=in.nextInt();
        System.out.println(DigitsSum.sumOfDigits(number));
    }



}