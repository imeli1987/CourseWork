public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("Печать всех");
        employeeBook.printEmployees();
        System.out.println();
        employeeBook.deleteEmployee(4);
        System.out.println("Печать всех после удаления");
        employeeBook.printEmployees();
        System.out.println("Печать всех");
        System.out.println();

        employeeBook.addEmployee("Петров Пётр Петрович", 2, 30000);
        System.out.println("Печать всех после добавления");
        employeeBook.printEmployees();
        System.out.println();
        employeeBook.printEmployeeId(4);
        //  employeeBook.id(10);

    //    employeeBook.salaryLessThanMax(80000);
//        salaryLessThanMin(60000);


//        printDepartmentEmployees(1);
//        indexDepartmentSalary(1, 10);
//        printDepartmentEmployees(1);

        //averageDepartmentSalary(2);

//        System.out.println(sumDepartmentSalary(5));

        // sumDepartmentSalary(5);
//        maxSalary();
//        minSalary();
//        printEmployees();
//        System.out.println(getSalarySum());
//
//        System.out.println(employees[4].getSalary());
//        Employee employee1 = employees[0];
//        Employee employee2 = employees[1];
//
//        System.out.println(employee1);
//        System.out.println(employee2);
//        employee2.setDepartment(3);
//        System.out.println(employee2);
//
//        System.out.println();
//        averageSalary();
//        printFio();
//
//        printEmployees();
//        indexSalary(10);
//        System.out.println();
//        printEmployees();

    }

}