import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Worker employee = new Worker();

        System.out.print("Insira o departamento: ");
        String departmentName = sc.nextLine();

        Department employeeDepartment = new Department(departmentName);
        employee.setDepartment(employeeDepartment);

        System.out.println("Insira os dados do trabalhador:");

        System.out.print("Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Level: ");

        String level = sc.nextLine();
        employee.setLevel(WorkerLevel.valueOf(level));

        System.out.print("Base salary: ");
        employee.setBaseSalary(sc.nextDouble());

        System.out.print("How many contracts to this worker? ");
        int qntdContracts = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < qntdContracts; i++) {

            HourContract contract = new HourContract();

            System.out.printf("Enter contract #%d data:%n", i + 1);

            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate d = LocalDate.parse(sc.nextLine(), fmt);
            contract.setDate(d);

            System.out.print("Value per hour: ");
            contract.setValuePerHour(sc.nextDouble());

            System.out.print("Duration (hours): ");
            contract.setHours(sc.nextInt());
            sc.nextLine();

            employee.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");

        String inputDate = "01/" + sc.nextLine();
        LocalDate d = LocalDate.parse(inputDate, fmt);

        Double income = employee.income(d.getYear(), d.getMonthValue());

        System.out.println();

        System.out.println(employee);
        System.out.printf("Income for %02d/%d: %.2f", d.getMonthValue(), d.getYear(), income);

        sc.close();
    }

}