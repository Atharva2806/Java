public class Main {
    public static void main(String[] args)
    {
        DecimalComparator dc=new DecimalComparator();
        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(dc.areEqualByThreeDecimalPlaces(3.175, 3.176));
    }
}