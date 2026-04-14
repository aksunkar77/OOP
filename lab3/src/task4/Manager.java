package task4;
import java.util.Vector;
import java.util.Date;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insNum, double bonus) {
        super(name, salary, hireDate, insNum);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addToTeam(Employee e) { team.add(e); }

    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other); 
        if (res == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager m = (Manager) o;
        return Double.compare(m.bonus, bonus) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus + ", Team size: " + team.size();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>(this.team); 
        return cloned;
    }
}