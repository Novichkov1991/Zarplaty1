package company.employes;

public class EmployeeByHour extends Employee {
    private float hour;
    private int salaryInHour;


    public EmployeeByHour(String name, float hour, int salaryInHour) {
        super(name);
        this.hour = hour;
        this.salaryInHour = salaryInHour;
    }

    public EmployeeByHour() {
        super();
    }





    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public int getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInHour = salaryInHour;
    }


    @Override
    public Float takeSalary() {
        return hour*salaryInHour;
    }
}
