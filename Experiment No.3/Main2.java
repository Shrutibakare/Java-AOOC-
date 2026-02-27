class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }

    void performanceReport() {
        System.out.println("Performance is good.");
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager m = new Manager("Shruti", "Kolhapur", 50000);
        m.calculateBonus();
        m.performanceReport();
    }
}