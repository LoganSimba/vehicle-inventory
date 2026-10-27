package com.pluralsight;

import java.util.Scanner;

public class vehicleInventoryAPP {
    static int numberOfVehiclesInInventory = 0;

    public static void main(String[] args) {

        //create scanner
        Scanner scanner = new Scanner(System.in);

        //create an array that can hold 20 elements
        Vehicle[] inventory = new Vehicle[20];


        //create a variable that tells us how many vehivlles are in the array
        int count = inventory.length;

        //create a vehicle and put them in the array
        Vehicle vehicle1 = new Vehicle(1001L, "Toyota Camry", "Blue", 45000, 18999.99);
        Vehicle vehicle2 = new Vehicle(1002L, "Honda Civic", "Red", 32000, 17450.00);
        Vehicle vehicle3 = new Vehicle(1003L, "Ford Mustang", "Black", 15000, 32999.95);
        Vehicle vehicle4 = new Vehicle(1004L, "Chevrolet Tahoe", "White", 60000, 28950.75);
        Vehicle vehicle5 = new Vehicle(1005L, "BMW X5", "Gray", 28000, 44999.00);
        Vehicle vehicle6 = new Vehicle(1006L, "BMW X6", "Blue", 30000, 44999.00);


        //add the Vehicle objects in the array
        inventory[0] = vehicle1;
        inventory[1] = vehicle2;
        inventory[2] = vehicle3;
        inventory[3] = vehicle4;
        inventory[4] = vehicle5;
        inventory[5] = vehicle6;

        numberOfVehiclesInInventory = 6;


        /*
        What do you want to do?
1 - List all inventory
2 - Search by make/model
3 - Search by price range
4 - Search by color
5 - Add a vehicle
6 - Quit
Enter your command:
         */
        boolean appRunning = true;
        while(appRunning){
        //create the menu
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all inventory");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");


        int command = scanner.nextInt();
        scanner.nextLine();// we eat the new line
        switch(command) {
            case 1 -> listAllVehicles(inventory);
            case 2 -> makeAndModel(scanner, inventory);
            case 4 -> searchByColor(scanner, inventory);
            case 5 -> addVehicle(scanner, inventory);
            case 6 -> appRunning = false;
            default -> System.out.println("Invalid Command");


        }
        }
    }
        // method to add the vehicle
        public static void addVehicle(Scanner scanner, Vehicle[] inventory){
            //ask all the questions
            System.out.print("Please enter the vehicle's id: ");
            int id = scanner.nextInt();

            //eat the newline
            scanner.nextLine();

            System.out.print("Please enter the make: ");
            String makeModel = scanner.nextLine();
            System.out.print("Please enter the color: ");
            String color = scanner.nextLine();
            System.out.print("Please enter the odometer reading: ");
            int odometerReading = scanner.nextInt();
            System.out.print("Please enter the price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // we have to eat the new line

            //create the vehicle
            Vehicle newVehicle = new Vehicle(id, makeModel, color, odometerReading, price);

            //add it to the last open spot in the ivnetory
            inventory[numberOfVehiclesInInventory] = newVehicle;
            //add it the last open spot in the inventory

            //increment index position for the next vehicle to be store in
            numberOfVehiclesInInventory++;
    }

    // added a method to search the inventory by make and model
    public static void makeAndModel(Scanner scanner, Vehicle[] inventory){
        System.out.print("Search make and model: ");
        String search = scanner.nextLine().trim();

        boolean found = false;

        for(int i = 0; i < numberOfVehiclesInInventory; i++){
            if(inventory[i].getMakeModel().equalsIgnoreCase(search)){
                System.out.println(inventory[i].toString());
                found = true;
            }
        }
        if(!found){
            System.out.println("No vehicles found matching: " + search);
        }

    }

    // method to search the inventory by color
    public static void searchByColor(Scanner scanner, Vehicle[] inventory){
        System.out.println("Search a vehicle by color: ");
        String search = scanner.nextLine();
        //boolean to track if we found a match
        boolean found = false;
        //iterating through the inventory to find a color match
        for(int i = 0; i < numberOfVehiclesInInventory; i++){
            if(inventory[i].getColor().equalsIgnoreCase(search)){
                System.out.println(inventory[i].toString());
                found = true;
            }
        }
        //if no match print a message
        if(!found){
            System.out.println("No vehicles found matching the color: " + search);
        }
    }

    // added method to list all vehicles in the inventory
    public static void listAllVehicles(Vehicle[] inventory) {
        for(int i = 0; i < numberOfVehiclesInInventory; i++) {
            System.out.println("make : " + inventory[i].getMakeModel());
        }
    }


    }

