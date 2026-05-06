package Parcial1;

public class VehiculoNoEncontradoException extends Exception {
    public VehiculoNoEncontradoException() {
        super("Error: No se encontró un vehículo con la patente ingresada.");
    }
}
