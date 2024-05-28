import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory extends Employee
{

    private final List employeeList;

    public CompanyDirectory()
    {
        employeeList = new ArrayList<>();
    }

    @Override
    public void printEmployeeDetails()
    {
//        for (Employee employee : employeeList)
//        {
//            employee.printEmployeeDetails();
//        }
    }

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

}