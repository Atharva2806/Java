public class Utility
{
    public int reverse(int num)
    {
        int rem;
        int rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }

    public void swap(int num1,int num2)
    {
        System.out.println("Before reverse");
        System.out.println("Value of num1 "+num1+" Value of num2"+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After reverse");
        System.out.println("Value of num1 "+num1+" Value of num2 "+num2);
    }
    public int sumNnumber(int num)
    {
        int i, sum=0;
        for(i=1;i<=num;i++)
        {
            sum += i;
        }
        return sum;
    }
    public float simpleInterest(float principle,float time,float rateOfInterest)
    {
        float si=0;

        si=(principle*time*rateOfInterest)/100f;

        return si;
    }
    public float poundTokilo(float pound)
    {
        float inkilo=0;
        inkilo=pound*0.453592f;

        return inkilo;
    }
}
