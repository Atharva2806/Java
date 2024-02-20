public class Utility
{    

    public boolean primeNumber(int num)
    {
        if(num==1)
        {
            System.out.println("It is not prime number");
        }
        else
        {   int i=1;
            int count=0;
            while(i<num)
            {
                if(num%i==0)
                {
                    count++;
                    if (count==2)
                    {
                        return true;
                    }
               }
                i++;
            }
        }
        return false;
    }

    public int reverse(int num)
    {
        int temp=num;
        int rev =0;
        int rem;
        while (temp != 0)
         {
            rem = temp % 10;
            rev = rem + rev * 10;
            temp /= 10;
        }
        return rev;
        
    }

    public int sumofDigits(int num)
    {
        int temp=num;
        int sum=0;
        int rem;

        while (temp!=0) 
        {
            rem=temp%10;
            sum=rem+sum;
            temp/=10;    
        }

        return sum;
    }

    public int factorial(int num)
    {
        int fact=1;
        int i;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        return fact;
    }

    public void fibonacci(int num)
    {
        int num1=0;
        int num2=1;
        int fb;
        int i;
        System.out.println("Fibbonacci sereis : \n"+num1+"\n"+num2);
        for (i=1;i<=num-2;i++)
        {
            fb=num1+num2;
            num1= num2;
            num2=fb;
            System.out.println(fb);
        }
    }

    public boolean evenOdd(int num)
    {
        if (num%2==0)
        {
            return true;
        }
        else{
        return false;
        }

    }
    public int power(int num ,int pow)

    {
	int value=1;
    int i;
	for(i=1;i<=pow;i++)
	{
	    value=value*num;  
	}
	return value;
    }
    

}