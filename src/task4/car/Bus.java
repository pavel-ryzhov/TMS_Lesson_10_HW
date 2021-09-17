package task4.car;

import java.util.Objects;

public class Bus extends Car{
    private int seatsAmount;
    private int length;
    private int height;

    public Bus(int seatsAmount, int length, int height, String brand, String model, int yearOfIssue, String color, int power) {
        this.seatsAmount = seatsAmount;
        this.length = length;
        this.height = height;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "seatsAmount=" + seatsAmount +
                ", length=" + length +
                ", height=" + height +
                ", Car=" + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return seatsAmount == bus.seatsAmount && length == bus.length && height == bus.height && super.equals(bus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatsAmount, length, height, super.hashCode());
    }
}
