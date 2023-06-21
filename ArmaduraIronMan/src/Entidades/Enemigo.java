
package Entidades;

/**
 *
 * @author AlejaDevelops
 */
public class Enemigo extends Guerrero{
    private boolean esHostil;

    public Enemigo() {
    }

    public Enemigo(boolean esHostil, Materiales nivelDeResistencia, Posicion posicion) {
        super(nivelDeResistencia, posicion);
        this.esHostil = esHostil;
    }

    public boolean isEsHostil() {
        return esHostil;
    }

    public void setEsHostil(boolean esHostil) {
        this.esHostil = esHostil;
    }

    @Override
    public String toString() {
        return "ENEMIGO" +super.toString()+ "\n Es hostil?: " + esHostil;
    }  
    
}
