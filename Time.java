public class Time
{
    
    private int hour;
    private int min;
    private int sec;

    public Time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    
    public Time(int hour,int min, int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public void display()
    {
        System.out.println("hour is "+hour+"\nmin is "+min+"\nsecond is "+sec);
    }

    public void addTime(Time t1,Time t2)
    {
        this.hour=t1.hour+t2.hour;
        this.min=t1.min+t2.min;
        this.sec=t1.sec+t2.sec;
    }

}

