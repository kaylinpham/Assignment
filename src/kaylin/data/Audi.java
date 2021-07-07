package kaylin.data;

import kaylin.util.InputHandler;

import java.util.Scanner;

public class Audi extends Vehicle {
    private String color;
    private int warranty;

    public Audi() {
        super();
    }

    public Audi(int vehicleId, String vehicleName, double price, int quantity, double rate, String color, int warranty) {
        super(vehicleId, vehicleName, price, quantity, rate);
        setColor(color);
        setWarranty(warranty);
    }

    @Override
    public void printVehicle() {
        System.out.printf("|AUDI|%6d|%10s|%5.2f|%4d|%5.2f|%10s|%6d|%5.2f|",
                vehicleId, vehicleName, price, quantity, rate, color, warranty, salePrice());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty())
            throw new IllegalArgumentException("Color can not be empty");
        this.color = color;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        if (warranty < 1 || warranty > 3)
            throw new IllegalArgumentException("1<=Warranty<=3");
        this.warranty = warranty;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the color (No empty): ");
                setColor(scanner.nextLine());
                setWarranty(InputHandler.getInteger("Enter the warranty (1<=warranty<=3): "));
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
