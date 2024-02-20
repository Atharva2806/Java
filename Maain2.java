public class Maain2
{
    public static void main(String args[])
    {
        Utility u1=new Utility();
        Utility u2=new Utility();
        boolean a;
        a=u1.primeNumber(23);
        if(a==true)
        {
                System.out.println("It is not prime");
        }
        else    
        {
                System.out.println("It is prime number");
        }
        int rev=u1.reverse(342);
        System.out.println("revers number is "+rev);

        int sum=u1.sumofDigits(564);
        System.out.println("Sum of digits is : "+sum);

        int fact = u2.factorial(6);
        System.out.println("factorial is : "+fact);

        u2.fibonacci(8);
        
        if(u1.evenOdd(132))
        {
          System.out.println("Number is Even");             
        }
        else
         {
                 System.out.println("Number is odd");
         }

        int pow=u1.power(12,3); 
        System.out.println("Value of power is : "+pow);
        

    }
}
