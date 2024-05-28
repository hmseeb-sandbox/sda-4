public class Company
{

    public static void main(String[] args)
    {
        Employee d1 = new Developer("Haseeb", 10);
        Employee d2 = new Developer("Ali", 11);
        Employee d3 = new Developer("Ahmed", 12);

        Employee m1 = new Manager("Uzair", 1);


        CompanyDetails companyDetails = new CompanyDetails("XYZ LLC");
        companyDetails.addEmployee(m1);
        companyDetails.addEmployee(d1);
        companyDetails.addEmployee(d2);
        companyDetails.addEmployee(d3);

        companyDetails.printEmployeeDetails();

    }
}