import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        double test1, test2, test3, test4;
        double average;

        try {
            Scanner inFile = new Scanner(new File("test.txt"));
            PrintWriter outFile = new PrintWriter("testavg.out");
            test1 = inFile.nextDouble();
            test2 = inFile.nextDouble();
            test3 = inFile.nextDouble();
            test4 = inFile.nextDouble();
            outFile.printf("Test scores: %.2f %.2f %.2f %.2f %n", test1, test2, test3, test4);
            average = (test1 + test2 + test3 + test4) / 4.0;
            outFile.printf("Average test scores: %.2f", average);
            outFile.close(); // Close the PrintWriter after writing to the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IO Exception: " + e);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
