import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");

        int n = sc.nextInt();
        sc.nextLine();

        List <Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.printf("Employee #%d data:%n", i + 1);

            System.out.print("Outsorced (y/n)? ");
            char answer = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String workerName = sc.nextLine();

            System.out.print("Hours: ");
            int workerHours = sc.nextInt();

            System.out.print("Value per hour: ");
            double workerValue = sc.nextDouble();

            boolean isOutsorced = answer == 'y';

            if (isOutsorced) {
                System.out.print("Additional charge: ");
                Employee outsourced = new OutsourcedEmployee(workerName, workerHours, workerValue, sc.nextDouble());
                employees.add(outsourced);
            }

            else {
                Employee employee = new Employee(workerName, workerHours, workerValue);
                employees.add(employee);
            }

            sc.nextLine();
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}