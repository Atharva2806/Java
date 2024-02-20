//Check if number is prime and print count of all prime numbers.
public class Prime
{
    public void checkIsPrime(int number)
    {

        int count = 0;
        int count1=0;
        int i=2;
        int j=2;
        while(i<=number)
        {
            while(j<i)
            {
                if(i%j!=0)
                {
                    count++;
                }
                j++;
            }
            if(number%i==0)
            {
               if(number%i==0)
               {
                    count1++;
               }
               i++;
            }
        }
        if(count1<=1)
        {
            System.out.println("It is Prime : "+number);
        }
        System.out.println("Total numer of prime number upto is "+number+"is"+count);
    }
}
