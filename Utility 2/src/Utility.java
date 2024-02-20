//Pallindrome
//First and last digit sum
//Even digit sum
public class Utility
{
    public static boolean isPallindrom(int number)
    {
        int temp = number;
        int rev =0;
        int rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return number == rev;
    }
    public static int sumOfFirstLastDigits(int number)
    {
//        int sum=0;
        int rem=0;
//        int a[4];
        int lastNum=number%10;
        while(number!=0)
        {
            rem=number%10;
            number=number/10;
        }
        int firstNum= rem;
//        sum=lastNum+firstNum;
        return firstNum+lastNum;
        
    }
    public static int Evendigitsum(int number)
    {
        int sum=0;
        int rem=0;
        while(number!=0)
        {
            rem=number%10;
            if(rem%2==0)
            {
                sum=sum+rem;
            }
            number=number/10;
        }
        return sum;
    }

}
