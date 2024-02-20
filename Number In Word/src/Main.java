import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value : ");
        int number=s1.nextInt();
        NumberInWord.printNumberInWord(number);
    }
}
