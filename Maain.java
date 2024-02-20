public class Maain
{
    public static void main(String a[])
    {
        Time t1;
        t1=new Time(12,32,43);
        t1.display();
        Time t2;
        t2=new Time(10,42,43);
        t2.display();
        Time t3=new Time();
        t1.addTime(t1,t2);
        t1.display();

    }
}