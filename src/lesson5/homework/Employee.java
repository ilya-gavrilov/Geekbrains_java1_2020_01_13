package lesson5.homework;


import java.util.Arrays;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Email: " + "; Телефон: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age + ".");
    }

    public static void employeesInfo(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void employeesOver40 (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                System.out.println("Over 40 " + employees[i]);
            }
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Уткин Василий Петрович", "Сантехник", "отсутствует", "333-22-55", 14500, 71);

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван", "Junior developer", "ii@mail.ru", "123-45-67", 30000, 21);
        employeesArray[1] = new Employee("Васильев Василий", "Middle Developer", "vv@mail.ru", "234-56-78", 35000, 35);
        employeesArray[2] = new Employee("Андреев Андрей", "Senior Developer", "aa@mail.ru", "345-67-89", 40000, 41);
        employeesArray[3] = new Employee("Ильин Илья", "Team lead", "ilil@mail.ru", "456-78-90", 50000, 48);
        employeesArray[4] = new Employee("Петров Пётр", "CEO", "pp@mail.ru", "567-89-01", 100000, 53);

        employee.employeeInfo();
        System.out.println("-------------------------------------------------------------------------------------");
        employeesInfo(employeesArray);
        System.out.println("-------------------------------------------------------------------------------------");
        employeesOver40(employeesArray);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
