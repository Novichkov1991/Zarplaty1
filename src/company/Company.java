package company;

import company.employes.Employee;

import java.util.ArrayList;

public class Company {
    ArrayList <Employee> employees;

    public Company(){
    }

    public Company(ArrayList<Employee> employees){
        this.employees = employees;
    }

    public Float calcSellary(){
        Float sum = 0.0f;
        for (Employee employee : employees){
            sum+=employee.takeSalary();
        }
        return sum;
    }
}
