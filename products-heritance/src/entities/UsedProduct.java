package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    LocalDate manufactureDate;

    public UsedProduct () {
        super();
    }
    public UsedProduct (String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag () {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("%s (used) $%.2f (Manufacture date: %s)", getName(), getPrice(), fmt.format(manufactureDate));
    }
}
