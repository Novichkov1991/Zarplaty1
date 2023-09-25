
package company;

import company.employes.Employee;
import company.employes.EmployeeByHour;
import company.employes.EmployeeStaffMember;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeByHour employee = new EmployeeByHour("Ivan", 20, 200);
        EmployeeStaffMember employeeStaffMember = new EmployeeStaffMember("Oleg", 40000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employeeStaffMember);

        Company company = new Company(employees);

        System.out.println(company.calcSellary());
    }
}
