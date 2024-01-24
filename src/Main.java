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

    public static void indexSalary(Employee[] employees) {
        double index = 0.25;
        for (int i = 0; i < employees.length ; i++) {
            employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * index);
            System.out.println(employees[i]);
        }
    }

    public static void minSalaryEmpOfDepartment(Employee[] employees, int department) {
        Employee minSalaryEmpDepartment = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                minSalaryEmpDepartment = employees[i];
                break;
            }
        }
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() <= minSalaryEmpDepartment.getSalary()) {
                minSalaryEmpDepartment = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой отдела №: "  + department + " " + minSalaryEmpDepartment);
    }

    public static void maxSalaryEmpOfDepartment(Employee[] employees, int department) {
        Employee maxSalaryEmpDepartment = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                maxSalaryEmpDepartment = employees[i];
                break;
            }
        }
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() > maxSalaryEmpDepartment.getSalary()) {
                maxSalaryEmpDepartment = employees[i];
            }
        }
        System.out.println("Сотрудник с максимально зарплатой отдела №: "  + department + " " + maxSalaryEmpDepartment);
    }

    public static void calculateSalaryDep(Employee[] employees, int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum +=employees[i].getSalary();
            }
        }
        System.out.println("Сумма трат на запрплату отелела № " + department + " " + sum);
    }

    public static void averageSalaryDep(Employee[] employees, int department) {
        double sum = 0;
        int emp = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum +=employees[i].getSalary();
                emp++;
            }
        }

        System.out.println("Средняя зарплата работников в отделе  № " + department + " " + sum/emp);
    }

    public static void indexSalaryDep(Employee[] employees, int department, double indexSalary) {
        double index = indexSalary / 100;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * index);
                System.out.println("Проиндексирповали зарплату работника отдела №: " + department + " На " + indexSalary + " % " + " " + employees[i]);
            }
        }
    }

    public static void printAllEmpDep(Employee[] employees, int department) {
       for (int i = 0; i < employees.length ; i++) {
           if (employees[i].getDepartment() == department) {
                System.out.println("id: " + employees[i].getId() + " ФИО: " +  employees[i].getFirstName() +" " + employees[i].getLastName() + " " +  employees[i].getSurname() + " Заработная плата: " +  employees[i].getSalary());

           }
       }
    }

    public static void minSalaryGiveValue(Employee[] employees, double value) {
        Employee minSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < value) {
                minSalaryEmp = employees[i];
                System.out.println("Сотрудники  с зарплатой меньще: " + value +  " id: " + employees[i].getId() + " ФИО: " +  employees[i].getFirstName() +" " + employees[i].getLastName() + " " +  employees[i].getSurname() + " Заработная плата: " +  employees[i].getSalary());
            }
        }
    }

    public static void maxSalaryGiveValue(Employee[] employees, double value) {
        Employee maxSalaryEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= value) {
                maxSalaryEmp = employees[i];
                System.out.println("Сотрудники  с зарплатой больще или равно: " + value +  " id: " + employees[i].getId() + " ФИО: " +  employees[i].getFirstName() +" " + employees[i].getLastName() + " " +  employees[i].getSurname() + " Заработная плата: " +  employees[i].getSalary());
            }
        }
    }




    public static void main(String[] args) {
        Employee[] employees = new Employee[10];


       employees[0] = new Employee("Иван", "Иванов", "Иванович", 1, 10_000);
       employees[1] = new Employee("Федор", "Федоров", "Федорович", 2, 11_000);
       employees[2] = new Employee("Артём", "Артёмов", "Артёмовч", 3, 12_000);
       employees[3] = new Employee("Игнат", "Игнатов", "Игнатович", 4, 13_000);
       employees[4] = new Employee("Максим", "Максимович", "Максимов", 5, 14_000);
       employees[5] = new Employee("Борис", "Борисов", "Борисович", 1, 10_000);
       employees[6] = new Employee("Захар", "Захаров", "Захарович", 2, 16_000);
       employees[7] = new Employee("Геннадий", "Геннадьев", "Геннадьевич", 3, 12_001);
       employees[8] = new Employee("Михаил", "Михайлов", "Михайлович", 1, 13_500);
       employees[9] = new Employee("Тут", "Я", "Первый", 5, 14);

        printAllEmp(employees);

       // System.out.println("Сумма затрат на зарплату в месяц  " + calculationSalary(employees));

        //minSalaryEmp(employees);

        //maxSalaryEmp(employees);

        //System.out.println("Средняя зарплата сотрудников " + calculationSalary(employees) / employees.length);

        //printAllEmpFIO(employees);

        //indexSalary(employees);

       // minSalaryEmpOfDepartment(employees,3);

        //maxSalaryEmpOfDepartment(employees,3);

        //calculateSalaryDep(employees,1);

        //averageSalaryDep(employees,1);

        //indexSalaryDep(employees,1,10);

        //printAllEmpDep(employees,1);

       // minSalaryGiveValue(employees,16_000);

        maxSalaryGiveValue(employees,11_000);

    }
}