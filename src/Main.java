import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Иванов Иван Иванович",1,10_000);
        employeeBook.addEmployee("Федоров Федор Федорович",2, 11_000);
        employeeBook.addEmployee("Артёмов Артем Артемович", 3, 12_500);
        employeeBook.addEmployee("Игнатов Игнат Игнатович", 4,12_500);
        employeeBook.addEmployee("Максимов Максим Максимович", 5,14_000);
        employeeBook.addEmployee("Борисов Борис Борисович", 1,10_000);
        employeeBook.addEmployee("Захаров Захар Захарович", 2, 16_000);
        employeeBook.addEmployee("Геннадьев Геннадий Геннадьевич", 3,12_001);
        employeeBook.addEmployee("Михаилов Михаил Михайлович", 4,13_500);
        employeeBook.addEmployee("Смирнов Василий Леопольдович", 5,14_000);



       //employeeBook.printAllEmp();

       //employeeBook.calculationSalary();

       //employeeBook.minSalaryEmp();

       //employeeBook.maxSalaryEmp();

        // employeeBook.calculationAverageSalary();

        //employeeBook.printAllEmpFIO();

       //employeeBook.indexSalary();

     // employeeBook.minSalaryEmpOfDepartment(1);

     //employeeBook.maxSalaryEmpOfDepartment(3);

     // employeeBook.calculateSalaryDep(5);

      //  employeeBook.averageSalaryDep(4);

     //employeeBook.indexSalaryDep(1,30);

      //  employeeBook.printAllEmpDep(3);

    //  employeeBook.minSalaryGiveValue(14000);

      //  employeeBook.maxSalaryGiveValue(13500);

      //  employeeBook.removeEmp("Борисов Борис Борисович", 6);
        employeeBook.removeEmp("Игнатов Игнат Игнатович", 4);
        employeeBook.addEmployee("Котик Владимир Петрович", 1, 20_222);

       // employeeBook.printAllEmp();
        //employeeBook.sizeEmp();
        employeeBook.setEmployees("котик владимир петрович", 5, 100_000);
        employeeBook.printAllEmp();
        employeeBook.sortingEmpByDep();




    }
}