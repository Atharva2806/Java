public class Main
{
    public static void main(String args[])
    {
        Utility r1=new Utility();
        System.out.println("1-> Revers Number");
        System.out.println("2-> Swapp Number");
        System.out.println("3-> Sum of N number");
        System.out.println("4-> Simple Interest");
        System.out.println("5->poundTokilo");

        int choice=2;
        switch(choice)
        {
            case 1->
            {
                System.out.println("reverse number is "+r1.reverse(121563));
            }
            case 2->
            {
                int a=10,b=20;
                r1.swap(a,b);
            }
            case 3->
            {
                System.out.println("Addition of n number is  "+r1.sumNnumber(10));
            }
            case 4->
            {
                System.out.println("simple interst is   "+r1.simpleInterest(10000,5,3));
            }
            case 5->
            {
                System.out.println("Pound to kilo conversion "+r1.poundTokilo(1.2f));
            }
            default ->
            {
                System.out.println("Pound to kilo conversion "+r1.poundTokilo(1.2f));
            }


        }
    }

}