import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any Number  : ");
        int number=in.nextInt();
        System.out.println(Utility.isPallindrom(number));
        System.out.println("Sum of First and Last Digits : "+Utility.sumOfFirstLastDigits(number));
        System.out.println("Sum of even Digits : "+Utility.Evendigitsum(number));

    }
}