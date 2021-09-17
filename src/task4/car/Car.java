package task4.car;

import java.util.Objects;

public abstract class Car {
    protected String brand;
    protected String model;
    protected int yearOfIssue;
    protected String color;
    protected int power;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue && power == car.power && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, color, power);
    }
}
