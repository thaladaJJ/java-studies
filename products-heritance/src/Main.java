import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List <Product> products = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {

            System.out.printf("Product #%d data:%n", i);

            System.out.print("Common, used or imported (c/u/i)? ");
            char typeofProduct = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String productName = sc.nextLine();

            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            switch (typeofProduct) {

                case 'c':
                    Product product = new Product(productName, productPrice);
                    products.add(product);
                    break;

                case 'u':
                    sc.nextLine();

                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

                    Product product1 = new UsedProduct(productName, productPrice, date);
                    products.add(product1);
                    break;

                case 'i':
                    System.out.print("Customs fee: ");
                    Product product2 = new ImportedProduct(productName, productPrice, sc.nextDouble());

                    products.add(product2);
                    break;
            }

            sc.nextLine();
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products)
            System.out.println(product.priceTag());
    }

}