public class Developer extends Employee
{

    protected String name;
    protected long empID;
    protected String designation;

    public Developer(String name, long empID)
    {
        this.name = name;
        this.empID = empID;
    }

    @Override
    public void printEmployeeDetails()
    {
        System.out.println("Name:" + name + " empID:" + empID + " Designation:Developer");
    }

}