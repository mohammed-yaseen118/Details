class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id +
                           ", Name: " + name +
                           ", Department: " + department +
                           ", Salary: " + salary);
    }
}

class EmployeeManager {
    Employee[] employees;
    int count;

    EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee list is full.");
        }
    }

    void showAll() {
        if (count == 0) {
            System.out.println("No employee records found.");
        } else {
            for (int i = 0; i < count; i++) {
                employees[i].display();
            }
        }
    }

    void searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee emp1 = new Employee(101, "John Doe", "HR", 50000);
        Employee emp2 = new Employee(102, "Jane Smith", "IT", 60000);
        Employee emp3 = new Employee(103, "Mike Johnson", "Finance", 55000);

        Employee emp4 = new Employee(101, "John Doe", "HR", 50000);
        Employee emp5 = new Employee(102, "Jane Smith", "IT", 60000);
        Employee emp6 = new Employee(103, "Mike Johnson", "Finance", 55000);


        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        manager.addEmployee(emp4);
        manager.addEmployee(emp5);
        manager.addEmployee(emp6);

        System.out.println("All Employees:");
        manager.showAll();

        System.out.println("\nSearching for Employee with ID 102:");
        manager.searchById(102);

        System.out.println("\nSearching for Employee with ID 105:");
        manager.searchById(105);
    }
}
