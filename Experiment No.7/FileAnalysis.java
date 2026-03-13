import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("sample.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                // Count words
                String[] w = line.split(" ");
                words += w.length;

                // Convert to lowercase
                line = line.toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if ("aeiou".indexOf(ch) != -1) {
                        vowels++;
                    }

                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Number of 'a': " + countA);

        } catch (Exception e) {
            System.out.println("File Error");
        }
    }
}