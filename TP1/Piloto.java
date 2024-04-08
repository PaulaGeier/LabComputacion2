package TP1;

public class Piloto extends Persona  implements Volador{
    private int carnetPiloto;

    public Piloto(int edad, String nombre, int carnetPiloto) {
        super(edad, nombre);
        this.carnetPiloto = carnetPiloto;
    }

    public int getCarnetPiloto() {
        return carnetPiloto;
    }

    public void setCarnetPiloto(int carnetPiloto) {
        this.carnetPiloto = carnetPiloto;
    }

    @Override
    public void volar() {
        System.out.println("Soy un piloto y vuelo aviones");
    }
}
