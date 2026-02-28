// Custom Exception
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddCheck {

    // Method that checks number
    public static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is Odd!");
        } else {
            System.out.println("Number is Even.");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(5);   // Change number to test
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}