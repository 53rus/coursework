import java.util.Objects;

public class Employee {

    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int idCounter = 1;

    public Employee(String fullName,  int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }



    public void setDepartment(int department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }

    public String toString() {
        return "id: " + this.id + " ФИО сотрудника: " +   this.fullName + " работник отдела № -  " + this.department + " заработная плата: " + this.salary + " руб.";
    }
}
