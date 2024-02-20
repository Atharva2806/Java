public class Area
{
    private int length;
    private int bredth;

    public void setdim(int length,int bredth)
    {
        this.length=length;
        this.bredth=bredth;
    }

    public int getArea()
    {
        int area=0;
        area=length*bredth;

        return area;
    }
}