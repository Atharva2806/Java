public class Students
{
    private String name;
    private int rollNo;
    private int phy;
    private int chem;
    private int math;

    public Students(String name,int rollNo,int phy, int chem,int math)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.phy=phy;
        this.chem=chem;
        this.math=math;
    }
    public double persentage()
    {
        double persent=0;
        persent= (double) (phy + chem + math) /3;
        return persent;
    }
    public void display()
    {
        System.out.println("Name of Student : "+name);
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Marks of phy : "+phy+"Marks of chem : "+chem+"Marks of math : "+math);
    }

}