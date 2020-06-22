package juniordeveloper;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    static int fuelTotal;

    public static void main(String[] args) {
        try {
            File fuelData = new File("InputData.txt");
            Scanner myScanner = new Scanner(fuelData);
            while (myScanner.hasNextLine()) {
                int data = Integer.parseInt(myScanner.nextLine());
                fuelCalculation(data);
            }

            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Total fuel required: " + fuelTotal);
    }

    public static double fuelCalculation(int mass) {
        double result = Math.floor(mass / 3) - 2;
        fuelTotal += result;
        return result;
    }
}
