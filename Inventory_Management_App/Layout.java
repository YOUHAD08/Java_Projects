package com.oop.projects.Inventory_Management_App;

public class Layout {

    void welcome_page(){
        System.out.println("----Welcome to the Stock Management System----");
    }

    void header(){
        System.out.print("----- ----- -- Stock Management-- ----- -----\n" );
    }
    void Home() {
        System.out.print(
                "1. Add a product\n" +
                        "\n" +
                        "2. Modify a product\n" +
                        "\n" +
                        "3. Delete a product\n" +
                        "\n" +
                        "4. Display the product list\n" +
                        "\n" +
                        "5. Search for a product\n" +
                        "\n" +
                        "6. Calculate the total value of the stock\n" +
                        "\n" +
                        "Choose an option:\n");
    }
    void footer(){
         System.out.print("H: Home ----- ----- ----- ----- ----- E: Exit\n" );
    }
    void Exit() {
        System.out.println("Exiting the Stock Management System");
    }

}
