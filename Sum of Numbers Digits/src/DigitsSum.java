//19. Digit Sum Challenge
//Take only positive integer number and add all its digits
public class DigitsSum {

    static public int sumOfDigits(int number)
    {
        if(number>0)
        {
            int rem;
            int sum=0;
            while(number!=0)
            {
                rem=number%10;
                sum=sum+rem;
                number=number/10;
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }
}
