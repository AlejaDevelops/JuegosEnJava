
package Service;

import Entidades.Enemigo;
import Entidades.Guerrero;
import Entidades.Materiales;
import Entidades.Posicion;

/**
 *
 * @author AlejaDevelops
 */
public class EnemigoService extends GuerreroService{
    @Override
    public Guerrero crearGuerrero() {
        
        Enemigo enemigo = new Enemigo();
        Posicion posicion = new Posicion(r.nextInt(8000)+1, r.nextInt(8000)+1, r.nextInt(8000)+1);
        enemigo.setPosicion(posicion);
        enemigo.setEsHostil(r.nextBoolean());
        Materiales[] materiales = Materiales.values();
        enemigo.setNivelDeResistencia(materiales[r.nextInt(materiales.length)]);  
        
        return enemigo;
    }
}
