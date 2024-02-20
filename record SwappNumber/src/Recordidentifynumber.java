public record Recordidentifynumber(int a ,int b)
{
    public String identify()
    {
        if(a>0)
        {
            return "Positive;";
        }
        else if(a<0)
        {
            return "Negative";
        }
        else
        {
            return "Zero";
        }
    }

}
