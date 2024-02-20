public class Main
{
    public static void main(String args[])
    {
        Age a1=new Age();

        if(a1.hasTeen(14,45,70))
            System.out.println("has teen. couse : Age is between 13 to 19");
        else
            System.out.println("Not a teen.");

        if(a1.isTeen(14))
            System.out.println("Is teen. couse : Age is between 13 to 19");
        else
            System.out.println("Not a teen.");


    }
}