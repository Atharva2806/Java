public class Main
{
    public static void main(String args[])
    {
    
        Hello h1= new Hello();
        Utility r1=new Utility();
        Area a1=new Area();
        Students s1=new Students("atharva",8,8,0,8);
        Employees e1=new Employees("ABC",101,"12-JAN-2020",1234.32f,"Ahmendnager");
        h1.msg1();
        System.out.println("reverse number is "+r1.reverse(121563));
        int a=10,b=20;
        r1.swap(a,b);
//        System.out.println("value of a "+a+"value of b"+b);
        System.out.println("Addition of n number is  "+r1.sumNnumber(10));
        System.out.println("simple interst is   "+r1.simpleInterest(10000,5,3));
        System.out.println("Pound to kilo conversion "+r1.poundTokilo(1.2f));

        a1.setdim(5,7);
        System.out.println("Area of rectangle is : "+a1.getArea());
        s1.display();
        System.out.println("Persentage of students : "+s1.persentage());
        e1.displayEmpdetail();

//Numbercheck
        Numbercheck n1=new Numbercheck();
        n1.checkNumber(-12);
        n1.checkNumber(154);
        n1.checkNumber(0);

//Speed
        Speed sp=new Speed();
        long conv=sp.toMilesPerHour(25.42);
        if(conv==-1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Conversion is "+conv);
        }
        sp.printConversion(25.42);

//Sysmemmory
        Sysmemmory m1=new Sysmemmory();
        m1.printMegaBytesAndKiloBytes(5000);

//Dog
        BarkingDog bd=new BarkingDog();
        System.out.println(bd.shouldWakeUp(true,4));

//year
        Year y1=new Year();
        System.out.println(y1.isLeapYear(-1600));
        System.out.println(y1.isLeapYear(1600));
        System.out.println(y1.isLeapYear(3000));

//DecimalComparator
        DecimalComparator dc=new DecimalComparator();
        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(dc.areEqualByThreeDecimalPlaces(3.175, 3.176));

//Addition
        Addition ad=new Addition();
        System.out.println(ad.hasEqualSum(1,1,3));

    }

}