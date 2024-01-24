import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String surname;
    private int department;
    private double salary;
    private int id;
    private static int idCounter = 1;

    public Employee(String firstName, String lastName, String surname, int department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, surname, department, salary);
    }

    public String toString() {
        return "id: " + this.id + " ФИО сотрудника: " + this.lastName +" " + this.firstName + " " +  this.surname + " работник отдела № -  " + this.department + " заработная плата: " + this.salary + " руб.";
    }
}
