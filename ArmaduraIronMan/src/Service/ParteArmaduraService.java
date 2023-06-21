package Service;

import Entidades.ListaPartesArmadura;
import Entidades.ParteArmadura;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author AlejaDevelops
 */
public class ParteArmaduraService {

    Random r = new Random();

    public ArrayList<ParteArmadura> crearPartes() {
        ArrayList<ParteArmadura> listaDePartes = new ArrayList();
        ListaPartesArmadura[] listaPartes = ListaPartesArmadura.values();

        for (ListaPartesArmadura aux : listaPartes) { //Se recorre el ENUM de nombres de partes
            ParteArmadura parte = new ParteArmadura(); //Se crea un objeto de tipo ParteArmadura y luego se setean sus 3 atributos: nombre(aux), setConsumoEnergia(aletorio) y setEstaDaniado(false) porque es la creación inicial y se asume que arranca en buen estado
            parte.setNombre(aux);
            parte.setConsumoEnergia(r.nextInt(50) + 10);
            parte.setEstaDaniado(false);
            listaDePartes.add(parte);
        }

        return listaDePartes;
    }

}
