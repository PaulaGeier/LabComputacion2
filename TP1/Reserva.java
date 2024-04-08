package TP1;

public class Reserva {
    private int numAsiento;
    private Vuelo vuelo;

    public Reserva(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public void agregarVuelo(){
        this.vuelo=vuelo;
    }
}
