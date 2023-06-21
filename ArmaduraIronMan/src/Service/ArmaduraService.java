package Service;

import Entidades.Armadura;
import Entidades.Guerrero;
import Entidades.Materiales;
import Entidades.ParteArmadura;
import Entidades.Posicion;
import java.util.Random;

/**
 *
 * @author AlejaDevelops
 */
public class ArmaduraService extends GuerreroService {

    Armadura armadura = new Armadura();
    Random r = new Random();

    @Override
    public Guerrero crearGuerrero() {
        Armadura armadura = new Armadura();
        Materiales[] materiales = Materiales.values();
        armadura.setNivelDeResistencia(materiales[r.nextInt(materiales.length)]);
        Posicion posicion = new Posicion(0, 0, 0); //Se asume que IronMan estará siempre en el origen
        armadura.setPosicion(posicion);
        armadura.setColorPrimario(crearColor());
        armadura.setColorSecundario(crearColor());
        armadura.setNivelDeSalud(r.nextInt(100));
        armadura.setNivelBateria(100); //Asumiendo que es el % de la carga del reactor, al iniciar se asume que está al 100%
        armadura.setReactor(Float.MAX_VALUE);

        ParteArmaduraService pas = new ParteArmaduraService();
        armadura.setPartes(pas.crearPartes());

        return armadura;
    }

    private String crearColor() {
        String[] colores = {"rojo", "azul", "verde", "amarillo", "naranja", "morado", "rosa", "gris", "negro", "blanco"};
        return colores[r.nextInt(colores.length)];

    }

    public double energiaConsumidaAlCaminar() {
        return 0;
    }

    public double energiaConsumidaAlCorrer() {
        return 0;
    }

    public double energiaConsumidaAlVolar() {
        return 0;
    }

    public double energiaConsumidaAlEscribir() {
        return 0;
    }

    public double energiaConsumidaAlLeer() {
        return 0;
    }

    public double energiaConsumidaAlPropulsar() {
        return 0;
    }

    public double energiaConsumidaAlDisparar() {
        return 0;
    }

    public double energiaConsumidaAlHablar() {
        return 0;
    }

    

}
