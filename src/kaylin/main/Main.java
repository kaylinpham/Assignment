package kaylin.main;

import kaylin.data.Audi;
import kaylin.data.AudiManagement;
import kaylin.data.Vehicle;
import kaylin.util.InputHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = 0;
        Audi audi = null;
        Scanner scanner = new Scanner(System.in);
        max = InputHandler.getIntegerWithMin(1, "Enter the maximum size: ");
        AudiManagement vehicles = new AudiManagement(max);

        int choice;
        boolean flag = true;
        String s = "";
        int n;

        while (flag) {
            showMenu();
            choice = InputHandler.getIntegerInRange("Enter your choice (1 to 5): ", 1, 5);

            switch (choice) {
                case 1:
                    audi = new Audi();
                    audi.input();
                    vehicles.addAudi(audi);
                    break;
                case 2:
                    n = InputHandler.getInteger("Enter ID to find: ");
                    audi = vehicles.findAudiByID(n);
                    audi.printVehicle();
                    break;
                case 3:
                    n = InputHandler.getInteger("Enter ID to update: ");
                    audi = vehicles.findAudiByID(n);
                    vehicles.updateAudi(audi);
                    break;
                case 4:
                    vehicles.printAudiList();
                    break;
                default:
                    System.out.println("Good bye!");
                    break;
            }
        }

        System.gc();
    }

    public static void showMenu() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("1. Adding a vehicle.");
        System.out.println("2. Finding by ID.");
        System.out.println("3. Updating by ID.");
        System.out.println("4. Display all vehicles.");
        System.out.println("5. Exit");
    }

}
