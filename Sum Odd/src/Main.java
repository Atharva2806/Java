import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter calue 1st number and 2nd number");
        int number1=in.nextInt();
        int number2=in.nextInt();
        OddNumbers o1=new OddNumbers();
        System.out.println(o1.isOdd(number1));
        System.out.println(o1.isOdd(number2));
        System.out.println(o1.sumOdd(number1,number2));
    }
}