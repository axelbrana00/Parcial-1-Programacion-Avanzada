package Parcial1;

public class GarageLlenoException extends Exception {
    public GarageLlenoException() { 
        super("Error: El garage se encuentra en su capacidad máxima.");
    }
}
