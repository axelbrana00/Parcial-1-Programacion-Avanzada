package Parcial1;

import java.util.ArrayList;

public class Garage {
    private int capacidadMaxima;
    private int espacioOcupado;
    private ArrayList<Vehiculo> vehiculos;

    public Garage(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.espacioOcupado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void ingresarVehiculo(Vehiculo v) throws GarageLlenoException, CapacidadInsuficienteException, PatenteDuplicadaException {
        
        if (vehiculos.size() >= 10) {
            throw new GarageLlenoException();
        }

        if (espacioOcupado + v.informarEspacio() > capacidadMaxima) {
            throw new CapacidadInsuficienteException();
        }

        for (Vehiculo existente : vehiculos) {
            if (existente.getPatente().equalsIgnoreCase(v.getPatente())) {
                throw new PatenteDuplicadaException();
            }
        }

        vehiculos.add(v);
        espacioOcupado += v.informarEspacio();
        System.out.println("Ingreso exitoso: " + v.getMarca() + " [" + v.getPatente() + "]");
    }

    public double retirarVehiculo(String patente) throws VehiculoNoEncontradoException {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                double costo = v.calcularCosto(); 
                espacioOcupado -= v.informarEspacio();
                vehiculos.remove(v);
                return costo;
            }
        }
        throw new VehiculoNoEncontradoException();
    }

    public int getEspacioDisponible() {
        return capacidadMaxima - espacioOcupado;
    }
}