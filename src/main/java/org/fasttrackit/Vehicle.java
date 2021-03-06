package org.fasttrackit;

public class Vehicle {

    private static int totalCount;

    private String name;
    private double fuelLevel;
    private double mileage;
    private double maxSpeed;
    private String fuelType;
    private double traveledDistance;
    private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double accelerate(double speed, double durationInHours) {
        if (speed > maxSpeed) {
            System.out.println("Maximum speed exceeded!");
            return 0;
        }
        if (fuelLevel <= 0) {
            System.out.println("You ran out of fuel!");
            return 0;
        }
        System.out.println(name + " is accelerating with " + speed + "km/h for " + durationInHours + "h.");
        double distance = speed * durationInHours;
        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance;

        double usedFuel = distance * mileage / 100;
        if(speed > 100){
            usedFuel = distance * mileage / 80;
        }
        System.out.println("Used fuel: " + usedFuel);
        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        System.out.println("Traveled distance: " + traveledDistance);

        return distance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelType='" + fuelType + '\'' +
                ", traveledDistance=" + traveledDistance +
                ", running=" + running +
                '}';
    }
}
