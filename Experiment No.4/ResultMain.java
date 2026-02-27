class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Subject1 = " + sub1);
        System.out.println("Subject2 = " + sub2);
    }
}

interface Sports {
    int sMarks = 20;
    void set();
}

class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks = " + sMarks);
    }

    void display() {
        int total = sub1 + sub2 + sMarks;

        System.out.println("Roll No = " + getRollNo());
        getMarks();
        set();
        System.out.println("Total Marks = " + total);
    }
}

public class ResultMain {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(101);
        r.setMarks(75, 85);
        r.display();
    }
}