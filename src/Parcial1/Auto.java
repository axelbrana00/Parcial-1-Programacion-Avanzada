package Parcial1;

public class Auto extends Vehiculo {
    public Auto(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    @Override
    public double calcularCosto() {
        return getHorasEstimadas() * 1000.0;
    }

    @Override
    public int informarEspacio() {
        return 2;
    }
}