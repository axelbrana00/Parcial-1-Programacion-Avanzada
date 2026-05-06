package Parcial1;

public class CapacidadInsuficienteException extends Exception {
    public CapacidadInsuficienteException() {
        super("Error: El vehículo requiere más espacio del disponible actualmente.");
    }
}
