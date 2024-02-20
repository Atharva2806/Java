public class Main {
    public static void main(String[] args)
    {
        //year
        Year y1=new Year();
        System.out.println(y1.isLeapYear(-1600));
        System.out.println(y1.isLeapYear(1600));
        System.out.println(y1.isLeapYear(3000));

    }
}