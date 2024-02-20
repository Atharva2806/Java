import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of Year");
        int year1= in.nextInt();
        NumberOfdays n1=new NumberOfdays();
        System.out.println(n1.isLeapYear(year1));
//        System.out.println(n1.isLeapYear(1600));
//        System.out.println(n1.isLeapYear(2017));
//        System.out.println(n1.isLeapYear(2000));
//        System.out.println(n1.isLeapYear(3000));
        System.out.println("Enter value of month and Year");
        int month=in.nextInt();
        int year2= in.nextInt();
        System.out.println(n1.getDaysInMonth(month,year2));
//        System.out.println(n1.getDaysInMonth(2, 2020));
//        System.out.println(n1.getDaysInMonth(2, 2018));
//        System.out.println(n1.getDaysInMonth(1, -2020));
//        System.out.println(n1.getDaysInMonth(-1, 2020));
    }
}