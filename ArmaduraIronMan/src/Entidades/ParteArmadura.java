

package Entidades;

/**
 *
 * @author AlejaDevelops
 */
public class ParteArmadura {
    private double consumoEnergia;
    public boolean estaDaniado;
    private ListaPartesArmadura nombre;

    public ParteArmadura() {
    }

    public ParteArmadura(double consumoEnergia, boolean estaDaniado, ListaPartesArmadura nombre) {
        this.consumoEnergia = consumoEnergia;
        this.estaDaniado = estaDaniado;
        this.nombre = nombre;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public boolean isEstaDaniado() {
        return estaDaniado;
    }

    public void setEstaDaniado(boolean estaDaniado) {
        this.estaDaniado = estaDaniado;
    }

    public ListaPartesArmadura getNombre() {
        return nombre;
    }

    public void setNombre(ListaPartesArmadura nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\n * Nombre: " + nombre+"\n   Consumo de energia: " + consumoEnergia + "\n   Está dañado?: " + estaDaniado;
    }
    
    
}
