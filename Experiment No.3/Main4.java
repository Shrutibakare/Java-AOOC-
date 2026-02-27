class Student {
    int roll_no;

    void getRoll(int r) {
        roll_no = r;
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }
}

class Result extends Test {
    void display() {
        int total = sub1 + sub2;
        System.out.println("Roll No: " + roll_no);
        System.out.println("Total Marks: " + total);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getRoll(101);
        r.getMarks(80, 90);
        r.display();
    }
}