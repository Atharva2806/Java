public class Employees
{
    private String name;
    private int eid;
    private String join_date;
    private  float salary;
    private String address;

    public Employees(String name, int eid, String join_date,float salary,String address)
    {
        this.name=name;
        this.eid=eid;
        this.join_date=join_date;
        this.salary=salary;
        this.address=address;
    }

    void displayEmpdetail()
    {
        System.out.println("Name of Employee\t\temployee id\t\tJoining date\t\tSalary\t\tAddress");
        System.out.println("\t\t"+name+"\t\t\t"+eid+"\t\t\t"+join_date+"\t\t\t"+salary+"\t\t\t"+address);
    }

}