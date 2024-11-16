public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов", 1, 50000);
        employeeBook.addEmployee("Петров", 2, 65000);
        employeeBook.addEmployee("Сидоров", 3, 80000);
        employeeBook.addEmployee("Михайлов", 4, 79000);
        employeeBook.addEmployee("Поляков", 5, 40000);
        employeeBook.addEmployee("Лебедев", 1, 68000);
        employeeBook.addEmployee("Васильев", 2, 99000);
        employeeBook.addEmployee("Булгаков", 3, 76000);
        employeeBook.addEmployee("Пушкин", 4, 57000);
        employeeBook.addEmployee("Есенин", 5, 51000);

        System.out.println("Печать всех");
        employeeBook.printEmployees(); // Список всех сотрудников

        System.out.println();
        employeeBook.minSalary();      // Сотрудник с минимальной зарплатой

        System.out.println();
        employeeBook.maxSalary();      // Сотрудник с максимальной зарплатой

        System.out.println();
        employeeBook.averageSalary();  // Средняя зарплата

        System.out.println();
        employeeBook.printFio();       // ФИО всех сотрудников

        System.out.println();
        employeeBook.indexSalary(10);   // Индексирование зарплаты

        employeeBook.printEmployees();     // Список всех сотрудников с индексированной зарплатой
        System.out.println();

        employeeBook.minDepartmentSalary(1); // Сотрудник с минимальной зарплатой в отделе
        System.out.println();

        employeeBook.maxDepartmentSalary(1); // Сотрудник с максимальной зарплатой в отделе
        System.out.println();

        employeeBook.sumDepartmentSalary(1); // Сумма зарплаты по отделу
        System.out.println();

        employeeBook.averageDepartmentSalary(1);  // Средняя зарплата по отделу
        System.out.println();

        employeeBook.indexDepartmentSalary(1, 10); // Индексирование зарплаты в отделе
        employeeBook.printDepartmentEmployees(1); // Список всех сотрудников с индексированной зарплатой в отделе
        System.out.println();

        System.out.println("Сотрудники с зарплатой меньше заданной:");
        employeeBook.salaryLessThanMin(60000);  // Сотрудники с зарплатой меньше заданной
        System.out.println();

        System.out.println("Сотрудники с зарплатой больше заданной");
        employeeBook.salaryMoreThanMax(60000);  // Сотрудники с зарплатой больше заданной
        System.out.println();

        employeeBook.addEmployee("Смирнов", 1, 100000); // Добавление нового сотрудника

        employeeBook.removeEmployee(1);  // Удаление сотрудника
        System.out.println();

        employeeBook.printEmployees();      // Список всех сотрудников после удаления сотрудника
        System.out.println();

        employeeBook.printEmployeeId(2);     // Получение сотрудника по id
        System.out.println();


    }

}