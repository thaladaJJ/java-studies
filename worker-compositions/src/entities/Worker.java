package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }
    public Worker (String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public Department getDepartment() {
        return department;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public List<HourContract> getContracts() {
        return contracts;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public void addContract (HourContract contract) {
        contracts.add(contract);
    }
    public void removeContract (HourContract contract) {
        contracts.remove(contract);
    }
    public Double income (int year, int month) {

        double sum = baseSalary;

        for (HourContract contract : contracts) {

            if (contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year)
                sum += contract.totalValue();

        }

        return sum;
    }

    @Override
    public String toString() {

        return String.format("Name: %s%nDepartment: %s", name, department.getName());
    }
}