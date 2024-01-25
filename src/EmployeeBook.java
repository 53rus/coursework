import java.util.List;
import java.util.SortedMap;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            throw new IllegalArgumentException("Мест нет");
        }
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(fullName, department, salary);
                employees[i] = newEmployee;
                size++;
                return;
            }
        }
    }

    public  void printAllEmp() {
        for (int i = 0; i  < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public void   calculationSalary() {
        double sumAllSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumAllSalary += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц  " + sumAllSalary);
    }

    public void   calculationAverageSalary() {
        double sumAllSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumAllSalary += employees[i].getSalary();
        }
        System.out.println("Средняя зарплата работников всех отделов " + sumAllSalary / employees.length);
    }

    public  void minSalaryEmp() {
        Employee minSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() <= minSalaryEmp.getSalary()) {
                minSalaryEmp = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой : " + minSalaryEmp);


    }

    public  void maxSalaryEmp() {
        Employee maxSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= maxSalaryEmp.getSalary()) {
                maxSalaryEmp = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой : " + maxSalaryEmp);
    }

    public  void printAllEmpFIO() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО: " + employees[i].getFullName());
        }
    }

    public  void indexSalary() {
        double index = 0.25;
        for (int i = 0; i < employees.length ; i++) {
            employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * index);
            System.out.println(employees[i]);
        }
    }

    public  void minSalaryEmpOfDepartment(int department) {
        Employee minSalaryEmpDepartment = employees[0];
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    minSalaryEmpDepartment = employees[i];
                    break;
                }
            }
        }
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() <= minSalaryEmpDepartment.getSalary()) {
                minSalaryEmpDepartment = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой отдела №: "  + department + " " + minSalaryEmpDepartment);
    }

    public  void maxSalaryEmpOfDepartment(int department) {
        Employee maxSalaryEmpDepartment = employees[0];
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    maxSalaryEmpDepartment = employees[i];
                    break;
                }
            }
        }
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() > maxSalaryEmpDepartment.getSalary()) {
                maxSalaryEmpDepartment = employees[i];
            }
        }
        System.out.println("Сотрудник с максимально зарплатой отдела №: "  + department + " " + maxSalaryEmpDepartment);
    }

    public  void calculateSalaryDep(int department) {
        double sum = 0;
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum +=employees[i].getSalary();
            }
        }
        System.out.println("Сумма трат на запрплату отелела № " + department + " " + sum);
    }

    public  void averageSalaryDep(int department) {
        double sum = 0;
        int emp = 0;
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    sum += employees[i].getSalary();
                    emp++;
                }
            }
        }
        System.out.println("Средняя зарплата работников в отделе  № " + department + " " + sum/emp);
    }

    public  void indexSalaryDep(int department, double indexSalary) {
        double index = indexSalary / 100;
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        } else for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * index);
                System.out.println("Проиндексирповали зарплату работника отдела №: " + department + " На " + indexSalary + " % " + " " + employees[i]);
            }
        }
    }

    public  void printAllEmpDep(int department) {
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department)
                    System.out.println("id: " + employees[i].getId() + " ФИО: " + employees[i].getFullName() + " Заработная плата: " + employees[i].getSalary());
            }
        }
    }

    public  void minSalaryGiveValue(double value) {
        Employee minSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < value) {
                minSalaryEmp = employees[i];
                System.out.println("Сотрудники  с зарплатой меньше: " + value +  " id: " + employees[i].getId() + " ФИО: " +  employees[i].getFullName() + " Заработная плата: " +  employees[i].getSalary());
            }
        }
    }

    public  void maxSalaryGiveValue(double value) {
        Employee maxSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= value) {
                maxSalaryEmp = employees[i];
                System.out.println("Сотрудники  с зарплатой больше или равно: " + value +  " id: " + employees[i].getId() + " ФИО: " +  employees[i].getFullName() + " Заработная плата: " +  employees[i].getSalary());
            }
        }
    }

    public void removeEmp(String fullName, int id) {
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getFullName().equalsIgnoreCase(fullName) && employees[i].getId() == id) {
                System.out.println("Работник ФИО " + employees[i].getFullName() + " удален  id:" + employees[i].getId());
                employees[i] = null;
                size--;
                return;
            }
        }
    }

    public void sizeEmp() {
        System.out.println("Рабочих мест занято " + size + " из 10");
    }

    public void setEmployees(String fullName, int department, double salary) {
        if (department > 5) {
            System.out.println("Выберите номер отдела от 1 до 5");
            return;
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getFullName().equalsIgnoreCase(fullName)) {
                    employees[i].setDepartment(department);
                    employees[i].setSalary(salary);
                }
            }
        }
    }

    public void sortingEmpByDep() {
        System.out.println("Работники  отдела №1");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 1) {
                System.out.println(employees[i].getFullName());
            }
        }
        System.out.println("__________________________");
        System.out.println("Работники  отдела №2");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 2) {
                System.out.println(employees[i].getFullName());
            }
        }
        System.out.println("__________________________");
        System.out.println("Работники  отдела №3");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 3) {
                System.out.println(employees[i].getFullName());
            }
        }
        System.out.println("__________________________");
        System.out.println("Работники  отдела №4");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 4) {
                System.out.println(employees[i].getFullName());
            }
        }
        System.out.println("__________________________");
        System.out.println("Работники  отдела №5");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 5) {
                System.out.println(employees[i].getFullName());
            }
        }
        System.out.println("__________________________");


    }

}
