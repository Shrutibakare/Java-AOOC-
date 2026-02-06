class Employee {

    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Yearly salary calculation
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        // Create two Employee objects
        Employee emp1 = new Employee("Shruti", "Bakare", 30000);
        Employee emp2 = new Employee("Amit", "Sharma", 40000);

        // Display yearly salaries before raise
        System.out.println("Before 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                " Yearly Salary: " + emp2.getYearlySalary());

        // Give 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        // Display yearly salaries after raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                " Yearly Salary: " + emp2.getYearlySalary());
    }
}
