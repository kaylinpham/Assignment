package kaylin.data;

import java.util.ArrayList;

public class AudiManagement implements IAudi {
    ArrayList<Audi> vehicles;
    private int max;

    public AudiManagement(int max) {
        this.max = max;
        vehicles = new ArrayList<>();
    }

    @Override
    public void addAudi(Audi a) {
        if (a == null || vehicles.size() >= max) {
            System.out.println("Add failed!");
            return;
        }

        boolean isExistID = true;
        while (isExistID) {
            a.setVehicleId((int) (Math.random() * 1000) + 1000);
            isExistID = vehicles.stream()
                    .map(Audi::getVehicleId)
                    .anyMatch(id -> id == a.getVehicleId());
        }

        vehicles.add(a);
        System.out.println("Add successfully");
    }

    @Override
    public Audi findAudiByID(int id) {
        for (int i = 0; i < vehicles.size(); i++)
            if (vehicles.get(i).getVehicleId() == id)
                return (Audi) vehicles.get(i);
        return null;
    }

    @Override
    public void updateAudi(Audi a) {
        if (a == null) {
            System.out.println("Update failed!");
            return;
        }
        a.input();
        System.out.println("Update successfully");
    }

    @Override
    public void printAudiList() {
        if (vehicles.size() == 0) {
            System.out.println("No vehicles!");
            return;
        }
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).printVehicle();
        }
    }
}
