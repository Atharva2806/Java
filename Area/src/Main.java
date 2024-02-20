public class Main
{
    public static void main(String args[])
    {
        AreaOfShapes a1=new AreaOfShapes();
        System.out.println(a1.area(5));
        System.out.println(a1.area(-112));
        System.out.println(a1.area(5,4));
        System.out.println(a1.area(-1.0, 4.0));
    }
}