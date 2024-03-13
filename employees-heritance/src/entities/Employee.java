package entities;
public class Employee {
    String name;
    Integer hours;
    Double valuePerHour;
    public Employee () {

    }
    public Employee (String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
    public Double payment () {
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f", name, payment());
    }
}