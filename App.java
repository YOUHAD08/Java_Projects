import java.util.Scanner;
public class  Inventory_Management_System {
    static String[] Id = new String[100];
    static String[] Name = new String[100];
    static int[] Qty = new int[100];
    static double[] Price = new double[100];
    static boolean Application_running = true ;
    static Scanner clavier = new Scanner(System.in);
    static int i = 0 ;
    public static void main(String[] args)  {
        System.out.print("----- ----- -- Stock Management-- ----- -----\n" );
        System.out.println("----Welcome to the Stock Management System----");
        System.out.print("H: Home ----- ----- ----- ----- ----- E: Exit\n" );
        while (Application_running) {
            String choice = clavier.next();
            System.out.print("----- ----- -- Stock Management-- ----- -----\n" );
            switch (choice) {
                case "1":
                    Add_Product();
                    break;
                case "2":
                    Modify_Product();
                    break;
                case "3":
                    Delete_Product();
                    break;
                case "4":
                    Display_Product_list();
                    break;
                case "5":
                    Search_Product();
                    break;
                case "6":
                    Calculate_Stock_Value();
                    break;
                case "H" :
                    Home();
                    break;
                case "E":
                    Exit();
                    break;}
            System.out.print("H: Home ----- ----- ----- ----- ----- E: Exit\n" );
        }

}

    static void Add_Product() {
        System.out.println("Add product Id");
        Id[i] = clavier.next();
        System.out.println("Add product Name");
        Name[i] = clavier.next();
        System.out.println("Add product Quantity");
        Qty[i] = clavier.nextInt();
        System.out.println("Add product Price");
        Price[i] = clavier.nextDouble();
        i++;
        System.out.println("The Product has been added \n");
    }

    static void Delete_Product() {
        System.out.println("Please Provide The ID of the product to be deleted ");
        String ID = clavier.next();
        for (int i = 0; i < Id.length; i++) {
            if (Id[i] != null && Id[i].equals(ID)) {
                System.arraycopy(Id, i + 1, Id, i, Id.length - i - 1);
                System.arraycopy(Name, i + 1, Name, i, Name.length - i - 1);
                System.arraycopy(Qty, i + 1, Qty, i, Qty.length - i - 1);
                System.arraycopy(Price, i + 1, Price, i, Price.length - i - 1);
            }
        }
        System.out.println("The Product has been deleted \n");
    }
    static void Display_Product_list() {
        System.out.println("Product List");
        System.out.printf("|(%-20s|%-20s|%-20s|%-20s|%n","ID","Name","Quantity","Price");
        for (int i = 0; i < Id.length; i++){
            if (Id[i]!=null){
                System.out.printf("|%-20s|%-20s|%-20d|%-20f|%n",Id[i],Name[i],Qty[i],Price[i]);
            }

        }
    }

    static void Search_Product() {
        System.out.println("Please Provide The ID of the product to be searched ");
        String ID = clavier.next();
        boolean found = false;
        for (int i = 0; i < Id.length; i++) {
            if (Id[i] != null && Id[i].equals(ID)) {
                found = true;
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%n","ID","Name","Quantity","Price");
                System.out.printf("|%-20s|%-20s|%-20d|%-20f|%n\n",Id[i],Name[i],Qty[i],Price[i]);
            }
        }
        if (!found) {
            System.out.println("The product you re asking is not in the list\n");
        }
    }

    static void Calculate_Stock_Value() {
        double Total_Value = 0;
        for (int i = 0; i < Id.length; i++) {
            if (Id[i] != null){
                Total_Value = Total_Value + (Price[i] * Qty[i]);
            }
        }
        System.out.printf("The total value of the stock is : %.2f %n" , Total_Value);
    }


    static void Exit() {
        System.out.println("Exiting the Stock Management System");
        Application_running = false;
    }

    static void Home() {
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


    static void Modify_Product()
    {
        boolean found=false ;
        System.out.println("Please Provide The ID of the product to be modified ");
        String ID = clavier.next();
        for (int i = 0; i < Id.length; i++)
        {
            if (Id[i] != null && Id[i].equals(ID))
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
                            System.out.println("Enter the new Id");
                            Id[i] = clavier.next();
                            break;
                        case 2:
                            System.out.println("Enter the new Product Name");
                            Name[i] = clavier.next();
                            break;
                        case 3:
                            System.out.println("Enter the new Product Quantity");
                            Qty[i] = clavier.nextInt();
                            break;
                        case 4:
                            System.out.println("Enter the new Product Price");
                            Price[i] = clavier.nextDouble();
                            break;
                    }
                }
        }
        if (!found){
            System.out.println("The product you re asking is not in the list\n");
        }
    }


}






