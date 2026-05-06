package Parcial1;

public class PatenteDuplicadaException extends Exception {
    public PatenteDuplicadaException() {
        super("Error: Ya existe un vehículo registrado con esa patente.");
    }
}