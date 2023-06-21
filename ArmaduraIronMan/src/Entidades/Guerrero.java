

package Entidades;

/**
 *
 * @author AlejaDevelops
 */
public abstract class Guerrero {
    protected Materiales nivelDeResistencia;
    protected Posicion posicion;

    public Guerrero() {
    }

    public Guerrero(Materiales nivelDeResistencia, Posicion posicion) {
        this.nivelDeResistencia = nivelDeResistencia;
        this.posicion = posicion;
    }

    public Materiales getNivelDeResistencia() {
        return nivelDeResistencia;
    }

    public void setNivelDeResistencia(Materiales nivelDeResistencia) {
        this.nivelDeResistencia = nivelDeResistencia;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "\n Nivel de resistencia: " + nivelDeResistencia+ "\n Posicion: " + posicion;
    }
    
   
    
    
    
}
