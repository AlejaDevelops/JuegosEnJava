
package Entidades;

/**
 *
 * @author AlejaDevelops
 */
public enum Materiales {
    MATERIAL_A("Aluminio endurecido", 52),
    MATERIAL_B("Hierro colado", 10),
    MATERIAL_C("Bronce", 60),
    MATERIAL_D("Acero", 85),
    MATERIAL_E("Titanio de alta pureza", 95);
    
    private final String nombre;
    private final int dureza;

    private Materiales(String nombre, int dureza) {
        this.nombre = nombre;
        this.dureza = dureza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDureza() {
        return dureza;
    }

    @Override
    public String toString() {
        return "Material " + nombre + ", Dureza Rockwell " + dureza;
    }
    
    
    
}
