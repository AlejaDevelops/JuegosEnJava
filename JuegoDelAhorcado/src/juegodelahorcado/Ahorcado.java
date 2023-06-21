/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegodelahorcado;

/**
 *
 * @author AlejaDevelops
 */
public class Ahorcado {
    private String[] palabra;
    private int nLetrasEncontradas;
    private int nJugadasMax;
    private String[] palabraAux; //Se irá llenando con las letras encontradas   

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int nLetrasEncontradas, int nJugadasMax, String[] palabraAux) {
        this.palabra = palabra;
        this.nLetrasEncontradas = nLetrasEncontradas;
        this.nJugadasMax = nJugadasMax;
        this.palabraAux = palabraAux;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getnLetrasEncontradas() {
        return nLetrasEncontradas;
    }

    public void setnLetrasEncontradas(int nLetrasEncontradas) {
        this.nLetrasEncontradas = nLetrasEncontradas;
    }

    public int getnJugadasMax() {
        return nJugadasMax;
    }

    public void setnJugadasMax(int nJugadasMax) {
        this.nJugadasMax = nJugadasMax;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }
    
    
}