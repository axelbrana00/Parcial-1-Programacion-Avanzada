package Parcial1;

public class Camion extends Vehiculo {
    public Camion(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    @Override
    public double calcularCosto() {
        return getHorasEstimadas() * 1500.0;
    }

    @Override
    public int informarEspacio() {
        return 3;
    }
}