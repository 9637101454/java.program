import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void setName(String name) {this.name = name;}
    public void setDepartment(String department) { this.department = department; }
    public void setSalary( int salary ) { this.salary = salary;}

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " , Department: " + department + ", Salary: " + salary);
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args) {
        
        boolean KeepRunningProgram = true;

        while (KeepRunningProgram) {
            System.out.println("Choose Operation");
            System.out.println("1. Add Employee");
            System.out.println("2. View all employees");
            System.out.println("3. Search by Id");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter choice: ");
            int choice;

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewAllEmployees();
                    break;

                case 3:
                    searchById();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    System.out.println(" GoodBye!");
                    KeepRunningProgram = false;
                    break;

                default:
                    System.out.println("Invalid choice. please Try again...");
            }
            
        }
       
    }

    static void addEmployee() {
        System.out.println("\n--- Add Employee ---");

       System.out.println("Enter ID: ");
       int id = sc.nextInt();
       sc.nextLine();

       System.out.println("Enter Employee Name: ");
       String name = sc.nextLine();

       System.out.println("Enter Department: ");
       String department = sc.nextLine();

       System.out.println("Enter Salary: ");
       int salary = sc.nextInt();
       sc.nextLine();

       Employee e = new Employee(id, name, department, salary);
       employees.add(e);
       System.out.println("Employee added successfully!");
    }

    static void viewAllEmployees() {
        System.out.println("\n--- All Employees ---");

        if (employees.isEmpty()) {
            System.out.println("No Employees found.");
            return;
        }

        System.out.println("ID | Name            | Department | Salary");
        System.out.println("---------------------------------------------");
        for (Employee e : employees) {
            e.display();
        }
        System.out.println("Total: " + employees.size() + " employee(s)");
    }    

    static void searchById() {
        System.out.println("\n--- Search Employee ---");
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("\nEmployee Found: ");
                e.display();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found ");
    }

    static void updateEmployee() {
        System.out.println("\n--- Update Employee ---");
        System.out.println("Enter ID to update: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.getId() == id) {
                sc.nextLine();

                System.out.print("New Name (press Enter to skip): ");
                String name = sc.nextLine();
                if (!name.isEmpty())
                    e.setName(name);

                System.out.print("New Department (press Enter to skip): ");
                String dept = sc.nextLine();
                if (!dept.isEmpty()) 
                    e.setDepartment(dept);

                System.out.print("New Salary (0 to skip): ");
                int salary = sc.nextInt();
                if (salary > 0)
                    e.setSalary((int) salary);

                System.out.println("Student updated successfully! ");
            }
        }

        System.out.println("Student with ID " + id + " not found ");
    }

    static void deleteEmployee() {
        System.out.println("\n--- Delete Employee ---");
        System.out.println("Enter ID to Delete: ");
        int id = sc.nextInt();

        boolean removed = employees.removeIf(e -> e.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully! ");
        }else {
            System.out.println("Student with ID " + id + " not found ");
        }

    }


}