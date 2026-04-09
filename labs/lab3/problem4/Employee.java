package labs.lab3.problem4;

import java.util.Date;

public class Employee extends Person implements Cloneable, Comparable<Employee> {

    String position;
    double salary;
    String insuranceNumber;
    Date dateOfHire;

    public Employee(String name, String position, double salary, String insuranceNumber, Date dateOfHire) {
        super(name);
        this.position = position;
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;
        this.dateOfHire = dateOfHire;
    }

    String getName() {
        return name;
    }

    Date getDateOfHire() {
        return dateOfHire;
    }

    double getSalary() {
        return salary;
    }

    String getPosition() {
        return position;
    }

    String getInsuranceNumber() {
        return insuranceNumber;
    }

    void setPosition(String position) {
        this.position = position;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + ", insuranceNumber="
                + insuranceNumber + ", dateOfHire=" + dateOfHire + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (insuranceNumber == null) {
            if (other.insuranceNumber != null)
                return false;
        } else if (!insuranceNumber.equals(other.insuranceNumber))
            return false;
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        if (this.dateOfHire != null) {
            cloned.dateOfHire = (java.util.Date) this.dateOfHire.clone();
        }

        return cloned;
    }

    @Override
    public int compareTo(Employee other) {
        if (this.salary > other.salary)
            return 1;
        if (this.salary < other.salary)
            return -1;
        return 0;
    }
}