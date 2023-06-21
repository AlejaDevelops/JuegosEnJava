
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author AlejaDevelops
 */
public class Armadura extends Guerrero{
    private String colorPrimario;
    private String colorSecundario;
    private int nivelDeSalud;
    private float nivelBateria;
    private float reactor;
    private ArrayList<ParteArmadura> partes; 

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelDeSalud, float nivelBateria, float reactor, ArrayList<ParteArmadura> partes, Materiales nivelDeResistencia, Posicion posicion) {
        super(nivelDeResistencia, posicion);
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelDeSalud = nivelDeSalud;
        this.nivelBateria = nivelBateria;
        this.reactor = reactor;
        this.partes = partes;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(int nivelDeSalud) {
        this.nivelDeSalud = nivelDeSalud;
    }

    public float getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(float nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public float getReactor() {
        return reactor;
    }

    public void setReactor(float reactor) {
        this.reactor = reactor;
    }

    public ArrayList<ParteArmadura> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<ParteArmadura> partes) {
        this.partes = partes;
    }

    @Override
    public String toString() {
        return "ARMADURA IRON MAN \n Color primario: " + colorPrimario +"\n Color secundario: " + colorSecundario + super.toString()+ "\n Nivel de salud: " + nivelDeSalud + "\n Nivel de Bateria: " + nivelBateria + "\n Reactor: " + reactor + "\n Partes: " + partes;
    }
    
    
    
    
}
