package Parcial1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Garage miGarage = new Garage(20);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- GESTIÓN DE ESTACIONAMIENTO ---");
            System.out.println("Espacio disponible: " + miGarage.getEspacioDisponible() + " puntos.");
            System.out.println("1. Ingresar Moto ($700/h)");
            System.out.println("2. Ingresar Auto ($1000/h)");
            System.out.println("3. Ingresar Camión ($1500/h)");
            System.out.println("4. Retirar Vehículo y Cobrar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = Integer.parseInt(sn.nextLine());

                switch (opcion) {
                    case 1, 2, 3 -> {
                        System.out.print("Patente: "); String pat = sn.nextLine();
                        System.out.print("Marca: "); String mar = sn.nextLine();
                        System.out.print("Modelo: "); String mod = sn.nextLine();
                        System.out.print("Horas estimadas: "); 
                        int hs = Integer.parseInt(sn.nextLine());
                        
                        Vehiculo nuevo = null;
                        if (opcion == 1) nuevo = new Moto(pat, mar, mod, hs);
                        if (opcion == 2) nuevo = new Auto(pat, mar, mod, hs);
                        if (opcion == 3) nuevo = new Camion(pat, mar, mod, hs);
                        
                        miGarage.ingresarVehiculo(nuevo);
                    }
                    case 4 -> {
                        System.out.print("Ingrese patente para retirar: ");
                        String pBusqueda = sn.nextLine();
                        double total = miGarage.retirarVehiculo(pBusqueda);
                        System.out.println("💰 Total a cobrar: $" + total);
                    }
                    case 5 -> {
                        salir = true;
                        System.out.println("Cerrando sistema...");
                    }
                    default -> System.out.println("Ocurrió un error: Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un valor numérico válido.");
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        sn.close();
    }
}