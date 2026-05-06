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

    public int getEspacioDisponible() {
        return capacidadMaxima - espacioOcupado;
    }
}
