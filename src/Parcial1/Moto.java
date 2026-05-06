package Parcial1;

public class Moto extends Vehiculo {
    public Moto(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    @Override
    public double calcularCosto() {
        return getHorasEstimadas() * 700.0;
    }

    @Override
    public int informarEspacio() {
        return 1;
    }
}