package innerclass;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();

        Company.Employee employee = company.new Employee();

        company.setName("Night");
        employee.setName("Aulia");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        employee.getCompanyName();
    }
}
