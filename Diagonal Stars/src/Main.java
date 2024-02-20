public class Main
{
    public static void main(String[] args)
    {
        int number= 5;
        int row;
        int col;

        for(row=1;row<=number;row++)
        {
            for(col=1;col<=number;col++)
            {
                if(col==row || col==number-row+1)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }


}