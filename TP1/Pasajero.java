package TP1;

public class Pasajero extends Persona{
    private double equipaje;
    private int numAsiento;

    public Pasajero(int edad, String nombre, double equipaje, int numAsiento) {
        super(edad, nombre);
        this.equipaje = equipaje;
        this.numAsiento = numAsiento;
    }

    public double getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(double equipaje) {
        this.equipaje = equipaje;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
}
