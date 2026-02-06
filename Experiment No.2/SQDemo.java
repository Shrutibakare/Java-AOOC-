import java.util.Scanner;

class Stack {
    int top = -1;
    int size;
    int[] stack;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class Queue {
    int front = 0, rear = -1, size;
    int[] queue;

    Queue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " enqueued into queue");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " dequeued from queue");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class SQDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Stack and Queue: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);
        Queue queue = new Queue(size);

        // Stack operations
        System.out.println("\n--- Stack Operations ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();

        // Queue operations
        System.out.println("\n--- Queue Operations ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();

        sc.close();
    }
}
