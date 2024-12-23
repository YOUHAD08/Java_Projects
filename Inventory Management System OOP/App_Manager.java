package com.oop.projects.Inventory_Management_App;

import java.util.Scanner;

public class App_Manager {
    boolean is_running=true;
    int increment_product =0;
    Product[] product_list;
    static Scanner clavier = new Scanner(System.in);

    public App_Manager(Product[] product_list) {
        this.product_list = product_list;
    }

    void Add_Products() {
        System.out.println("How Many Products do Want to Add ?");
        int number_of_product_to_add=clavier.nextInt();
        int i=0;
        while(i <number_of_product_to_add){
            System.out.printf("-----Product %d----\n",(i+1));
            System.out.println("Add product Id");
            int Code = clavier.nextInt();
            System.out.println("Add product Name");
            String Name = clavier.next();
            System.out.println("Add product Price");
            double Price = clavier.nextInt();
            System.out.println("Add product Quantity");
            int Quantity = clavier.nextInt();
            Product p = new Product(Code, Name, Price, Quantity);
            product_list[increment_product] = p;
            i++;
            increment_product++;
        }
        System.out.println("The Products have been added \n");
    }
    void Modify_Product()
    {
        boolean found=false ;
        System.out.println("Please Provide The Name of the product to be modified ");
        String Name = clavier.next();
        for (int i = 0; i<increment_product; i++)
        {
            if (product_list[i].getName().equals(Name))
            {
                found=true;
                System.out.println("What should be Modified?\n" +
                        "\n" +
                        "1. Id\n" +
                        "\n" +
                        "2. Product Name\n" +
                        "\n" +
                        "3. Product Quantity\n" +
                        "\n" +
                        "4. Product Price \n"
                );

                int choice = clavier.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.println("Enter the new Code");
                        product_list[i].setCode(clavier.nextInt());
                        break;
                    case 2:
                        System.out.println("Enter the new Product Name");
                        product_list[i].setName(clavier.next());
                        break;
                    case 3:
                        System.out.println("Enter the new Product Quantity");
                        product_list[i].setQuantity(clavier.nextInt());
                        break;
                    case 4:
                        System.out.println("Enter the new Product Price");
                        product_list[i].setPrice(clavier.nextDouble());
                        break;
                }
            }
        }
        if (!found){
            System.out.println("The product you re asking is not in the stock\n");
        }
    }
    void Delete_Product() {
        boolean found=false;
        System.out.println("Please Provide The Name of the product to be deleted ");
        String Name = clavier.next();
        for (int i = 0; i < product_list.length; i++) {
            if (product_list[i] != null && product_list[i].getName().equals(Name)) {
                found=true;
                System.arraycopy(product_list, i + 1, product_list, i, product_list.length - i - 1);
                System.out.println("The Product has been deleted \n");
            }
        }
        if (!found){
            System.out.println("The product you re asking is not in the stock\n");
        }

    }

    void Search_Product() {
        System.out.println("Please Provide The Name of the product to be searched ");
        String Name = clavier.next();
        boolean found = false;
        for (int i = 0; i < increment_product; i++) {
            if (product_list[i].getName().equals(Name)) {
                found = true;
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%n","ID","Name","Price","Quatity");
                System.out.printf(String.valueOf(product_list[i]));
            }
        }
        if (!found) {
            System.out.println("The product you re asking is not in the list\n");
        }
    }

    void Display_Product_list() {
        System.out.println("Product List");
        System.out.printf("|(%-20s|%-20s|%-20s|%-20s|%n","Code","Name","Price","Quantity");
        for (int i = 0; i < increment_product; i++){
            System.out.printf(String.valueOf(product_list[i]));
        }
    }
    void Calculate_Stock_Value() {
        double Total_Value = 0;
        for (int i = 0; i < increment_product; i++) {
            Total_Value = Total_Value + (product_list[i].getPrice() * product_list[i].getQuantity());
        }
        System.out.printf("The total value of the stock is : %.2f %n" , Total_Value);
    }
}

