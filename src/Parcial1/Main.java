package Parcial1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Garage miGarage = new Garage(20); 
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU GARAGE ---");
            System.out.println("1. Ingresar Vehículo");
            System.out.println("2. Retirar y Cobrar");
            System.out.println("3. Salir");
            System.out.print("Elegir: ");

            try {
                int opcion = sn.nextInt();
                sn.nextLine(); 

                if (opcion == 1) {
                    System.out.println("Ingresando vehículo... (Lógica en proceso)");
                } else if (opcion == 2) {
                    System.out.println("Retirando vehículo... (Lógica en proceso)");
                } else if (opcion == 3) {
                    salir = true;
                }
            } catch (Exception e) {
                System.out.println("Error: Use números del 1 al 3.");
                sn.nextLine();
            }
        }
        System.out.println("Cerrando sistema.");
    }
}