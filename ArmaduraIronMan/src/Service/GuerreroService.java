/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Guerrero;
import java.util.Random;

/**
 *
 * @author AlejaDevelops
 */
public abstract class GuerreroService {

    Random r = new Random();

    public abstract Guerrero crearGuerrero();
}
