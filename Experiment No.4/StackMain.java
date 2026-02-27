interface Stack {
    int size = 5;

    void push(int value);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    int arr[] = new int[size];
    int top = -1;

    public void push(int value) {
        if (overflow())
            System.out.println("Stack Overflow!");
        else {
            arr[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    public void pop() {
        if (underflow())
            System.out.println("Stack Underflow!");
        else {
            System.out.println(arr[top] + " popped");
            top--;
        }
    }

    public void display() {
        if (underflow())
            System.out.println("Stack is empty");
        else {
            for (int i = top; i >= 0; i--)
                System.out.println(arr[i]);
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class StackMain {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}