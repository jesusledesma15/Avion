/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jesus.daw.avion;

/**
 *
 * @author jesus
 */
public class Avion {
    private int numAsientos;
    private int numPasajeros;
    private String destino;
    private boolean isFly;

    public Avion(int numAsientos, int numPasajeros, String destino, boolean isFly) {
        this.numAsientos = numAsientos;
        this.numPasajeros = numPasajeros;
        this.destino = destino;
        this.isFly = isFly;
    }

    public void despegar(){
        this.isFly = true;
    }
    
    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isIsFly() {
        return isFly;
    }

    public void setIsFly(boolean isFly) {
        this.isFly = isFly;
    }

    @Override
    public String toString() {
        return "Avion{" + "numAsientos=" + numAsientos + ", numPasajeros=" + numPasajeros + ", destino=" + destino + ", isFly=" + isFly + '}';
    }
    
    
}
