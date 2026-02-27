interface Shape {
    void area();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(6, 4);

        r.area();
        t.area();
    }
}