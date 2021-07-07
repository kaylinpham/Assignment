package kaylin.data;

import kaylin.util.InputHandler;

import java.util.Scanner;

public abstract class Vehicle {
    protected int vehicleId;
    protected String vehicleName;
    protected double price;
    protected int quantity;
    protected double rate;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String vehicleName, double price, int quantity, double rate) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.price = price;
        this.quantity = quantity;
        this.rate = rate;
    }

    public abstract void printVehicle();

    public double salePrice() {
        return price * rate;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        if (vehicleName.trim().isEmpty())
            throw new IllegalArgumentException("Vehicle's name field cannot be empty");
        this.vehicleName = vehicleName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Price must be greater than 0");
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be greater than 0");
        this.quantity = quantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate <= 0)
            throw new IllegalArgumentException("Rate must be greater than 0");
        this.rate = rate;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the vehicle's name (No empty): ");
                setVehicleName(scanner.nextLine());
                setPrice(InputHandler.getDouble("Enter the price ( >0 ): "));
                setQuantity(InputHandler.getInteger("Enter the quantity ( >0 ):"));
                setRate(InputHandler.getDouble("Enter the rate ( >0 ): "));
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
