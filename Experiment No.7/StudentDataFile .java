import java.io.*;
import java.util.Scanner;

public class StudentDataFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            // Writing data to file
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream("student.txt"));

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            dos.close();

            System.out.println("\nData Stored Successfully!");

            // Reading data from file
            DataInputStream dis = new DataInputStream(
                    new FileInputStream("student.txt"));

            System.out.println("\nStudent Data:");

            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readDouble());
            System.out.println("Height: " + dis.readDouble());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readUTF());

            dis.close();

        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}