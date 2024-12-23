package com.oop.projects.Inventory_Management_App;

import java.util.Scanner;

public class Inventory_Management_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number_of_products = 300;
        App_Manager App_1 = new App_Manager(new Product[number_of_products]);
        Layout App_1_layout = new Layout();

        App_1_layout.welcome_page();
        App_1_layout.footer();

        while (App_1.is_running) {
            String choice = sc.next();
            App_1_layout.header();
            switch (choice) {
                case "1":
                    App_1.Add_Products();
                    break;
                case "2":
                    App_1.Modify_Product();
                    break;
                case "3":
                    App_1.Delete_Product();
                    break;
                case "4":
                    App_1.Display_Product_list();
                    break;
                case "5":
                    App_1.Search_Product();
                    break;
                case "6":
                    App_1.Calculate_Stock_Value();
                    break;
                case "H" :
                    App_1_layout.Home();
                    break;
                case "E":
                    App_1_layout.Exit();
                    App_1.is_running=false;
                    break;}
                if(App_1.is_running){App_1_layout.footer();}
        }
    }
}
