import java.util.Scanner;

class Area {

    // Instance variables
    private int length;
    private int breadth;

    // Method to set dimensions
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    public int getArea() {
        return length * breadth;
    }
}

public class AreaTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object of Area class
        Area rectangle = new Area();

        // Take input from user
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        // Set dimensions
        rectangle.setDim(length, breadth);

        // Display area
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        sc.close();
    }
}
