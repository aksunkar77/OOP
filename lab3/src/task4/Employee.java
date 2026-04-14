package task4;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insNum) {
        super(name);
        this.annualSalary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insNum;
    }

    public double getAnnualSalary() { return annualSalary; }
    public Date getHireDate() { return hireDate; }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + annualSalary + ", Hired: " + hireDate + ", Insurance: " + insuranceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee e = (Employee) o;
        return Double.compare(e.annualSalary, annualSalary) == 0 && insuranceNumber.equals(e.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.annualSalary, other.annualSalary);
    }

    @Override 
    public Object clone() throws CloneNotSupportException {
    	return super.clone()
    }
}