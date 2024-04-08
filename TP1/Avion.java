package TP1;

public class Avion implements Volador {
    private String patente;
    private Vuelo vuelo;
    private Flota flota;

    public Avion() {
    }

    public Avion(String patente, Vuelo vuelo, String ubicacion ){
        this.patente = patente;
        this.vuelo = vuelo;
        this.flota = new Flota(ubicacion);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    @Override
    public void volar() {

    }
}
