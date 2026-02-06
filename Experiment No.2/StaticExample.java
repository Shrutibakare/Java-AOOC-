class StaticExample {

    // Static variable
    static int count;

    // Static block
    static {
        count = 10;
        System.out.println("Static block executed");
        System.out.println("Initial count value: " + count);
    }

    // Static method
    static void incrementCount() {
        count++;
        System.out.println("Count after increment: " + count);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        System.out.println("Main method started");

        // Access static variable
        System.out.println("Count in main: " + StaticExample.count);

        // Call static method
        StaticExample.incrementCount();
        StaticExample.incrementCount();
    }
}
