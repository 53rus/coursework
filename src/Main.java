import java.util.Arrays;

public class Main {

    public static double calculationSalary(Employee[] employees) {
        double sumAllSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumAllSalary += employees[i].getSalary();
        }
        return sumAllSalary;
    }

    public static void printAllEmp(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void minSalaryEmp(Employee[] employees) {
        Employee minSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() <= minSalaryEmp.getSalary()) {
                minSalaryEmp = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой : " + minSalaryEmp);


    }

    public static void maxSalaryEmp(Employee[] employees) {
        Employee maxSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= maxSalaryEmp.getSalary()) {
                maxSalaryEmp = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой : " + maxSalaryEmp);
    }

    public static void printAllEmpFIO(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Фамилия: " + employees[i].getLastName() + " Имя: " + employees[i].getFirstName() + " Отчество: " + employees[i].getSurname());
        }
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

       employees[0] = new Employee("Иван", "Иванов", "Иванович", 1, 18763);
       employees[1] = new Employee("Федор", "Федоров", "Федорович", 2, 124567);
       employees[2] = new Employee("Артём", "Артёмов", "Артёмовч", 1, 4444);
       employees[3] = new Employee("Игнат", "Игнатов", "Игнатович", 5, 10600);
       employees[4] = new Employee("Максим", "Максимович", "Максимов", 3, 10001);
       employees[5] = new Employee("Борис", "Борисов", "Борисович", 4, 132566);
       employees[6] = new Employee("Захар", "Захаров", "Захарович", 2, 98763);
       employees[7] = new Employee("Геннадий", "Геннадьев", "Геннадьевич", 5, 112345);
       employees[8] = new Employee("Михаил", "Михайлов", "Михайлович", 1, 134564);
       employees[9] = new Employee("Тут", "Я", "Первый", 3, 1001016);

        printAllEmp(employees);
        System.out.println("Сумма затрат на зарплату в месяц  " + calculationSalary(employees));
        minSalaryEmp(employees);
        maxSalaryEmp(employees);
        System.out.println("Средняя зарплата сотрудников " + calculationSalary(employees) / employees.length);
        printAllEmpFIO(employees);


    }
}