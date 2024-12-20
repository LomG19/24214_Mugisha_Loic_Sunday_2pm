import java.io.*;
import java.util.Scanner;

public class Examplle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name to open: ");
        String fileName = scanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            System.out.println("File opened successfully!");
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: The file you are trying to access does not exist. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}