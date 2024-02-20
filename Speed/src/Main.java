public class Main {
    public static void main(String[] args)
    {
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
        sp.printConversion(-25.42);
    }
}