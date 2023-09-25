package company.employes;

public class EmployeeStaffMember extends Employee{
    private int salary;


    public EmployeeStaffMember(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public EmployeeStaffMember() {
        super();
    }




    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public Float takeSalary() {
        return Float.valueOf(salary);
    }
}
