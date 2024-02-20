public class Students
{
    private String name;
    private int rollNo;
    private int percentage;

    public Students(String name, int rollNo, int percentage)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", percentage=" + percentage +
                '}';
    }
}
