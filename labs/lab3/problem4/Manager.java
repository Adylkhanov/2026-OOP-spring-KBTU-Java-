package labs.lab3.problem4;

import java.util.Vector;
import java.util.Date;

public class Manager extends Employee {
    Vector<Employee> team;
    double bonus;

    public Manager(String name, String position, double salary, Vector<Employee> team, String insuranceNumber,
            Date dateOfHire, double bonus) {
        super(name, position, salary, insuranceNumber, dateOfHire);
        this.team = team;
        this.bonus = bonus;
    }

    Vector<Employee> getTeam() {
        return team;
    }

    double getBonus() {
        return bonus;
    }

    void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", team=" + team + ", name=" + name + ", position=" + position
                + ", salary=" + salary + ", insuranceNumber=" + insuranceNumber + ", dateOfHire=" + dateOfHire
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Manager manager = (Manager) obj;
        return name.equals(manager.name) && position.equals(manager.position) && salary == manager.salary
                && insuranceNumber.equals(manager.insuranceNumber) && dateOfHire.equals(manager.dateOfHire)
                && bonus == manager.bonus && team.equals(manager.team);
    }

    @Override
    public int compareTo(Employee other) {
        super.compareTo(other);

        if (this instanceof Manager && other instanceof Manager) {
            return Double.compare(((Manager) this).getBonus(), ((Manager) other).getBonus());
        }
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();

        if (this.team != null) {
            // Создаем новый вектор и копируем в него элементы текущего
            cloned.team = new Vector<Employee>(this.team);
        }

        return cloned;
    }

}