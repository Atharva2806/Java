class  Employees
{
    private int age;
    private int eid;
    private String name;

    public Employees()
    {
        age=0;
        eid=0;
        name="NA";
    }
    public Employees(int age,int eid,String name)
    {
        this.age=age;
        this.eid=eid;
        this.name=name;
    }


    void display()
    {
        System.out.println("age is : "+age+"\neid is : "+eid+"\nname is : "+name);
    }
}

public class class2
{   
    public static void main(String args[])
    {
        Employees e1=new Employees(28,101,"ATHARVA"); 
        e1.display();
    }

}