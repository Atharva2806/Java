//10. Time challenge
//
//Write a method getDurationString with one parameter for
// seconds and overloaded method with two parameters for minutes
// and seconds and both will return below format
//XXh YYm ZZs  => XX is hour YY minutes and ZZ is seconds
//
////Put validations as second must be >=0 for 1st method and minutes >=0 and second >=0 and <=59 for 2nd method

public class TimeChallenge
{
    public static String getDurationString(int sec)
{
    int hour = 00;
    int min=00;
    if(sec>=0 && sec<=59)
    {
        String tm= hour+"h "+min+"m "+sec+"s ";
        System.out.println(tm);
        return tm;
    }
    else
    {
        return "Invalid Time";
    }
}
    public static String getDurationString(int sec,int min)
    {
        int hour = 00;
        if(sec>=0 && sec<=59 && min>=0 && min<=59)
        {
            String tm= hour+"h "+min+"m "+sec+"s ";
            System.out.println(tm);
            return tm;
        }
        else
        {
            return "Invalid Time";
        }
    }
}