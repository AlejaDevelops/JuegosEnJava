/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegodelahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class AhorcadoService {    
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        
        String[] listaPalabras = {"codigo","programacion", "java", "lenguajes", "tecnologia","cooperacion","esfuerzo","inteligencia","compilador","ejecucion","backend"};
        //String[] listaPalabras = {"carrera", "azul", "cama", "faro","helado","jugo","yoyo","conocer","pulpo","heladeria"};
        int n = (int)(Math.random()*11); //Elección al azar de la posición del vector listaPalabras, para escoger la palabra al azar
        Ahorcado juego1 = new Ahorcado();        
        juego1.setPalabra(listaPalabras[n].split(""));        
        int jugadasMax = (int)(juego1.getPalabra().length/1.5); //Cálculo de las oportunidades
        juego1.setnJugadasMax(jugadasMax);        
        juego1.setnLetrasEncontradas(0);        
        
        String[] vectorAux1 = new String[juego1.getPalabra().length]; //Inicialización del vector de letras encontradas
        Arrays.fill(vectorAux1, "_");
        juego1.setPalabraAux(vectorAux1);
        
        System.out.println("Bienvenido!");
        System.out.println("El sistema ha seleccionado una palabra que debes adivinar");
        System.out.println("Tema: PROGRAMACION Y TECNOLOGIA");
        //System.out.println("Tema: PALABRAS FAVORITAS DE ALESSANDRO");
        System.out.println("Tienes "+juego1.getnJugadasMax()+" oportunidades de equivocarte");
        
        
        
                
        return juego1;        
    }
    
    public int longitud(Ahorcado a){
        int longitud = a.getPalabra().length;        
        return longitud;
    }
    
    public int buscar(Ahorcado b, String letra){      
        int cont = 0;
        boolean bandera;
        
        for (int i = 0; i< b.getPalabra().length ; i++) {             
            if (letra.equalsIgnoreCase(b.getPalabra()[i])) {
                b.getPalabraAux()[i]=letra;
                cont++;                
            }        
        }
        if (cont>0) {
            System.out.println("La letra fue encontrada " +cont+" vez/veces");
            bandera = true;
        } else{
            System.out.println("La letra no fue encontrada en la Palabra");
            bandera = false;
        }
        System.out.println(" ");
        return cont;
    }
    
    public boolean encontradas(Ahorcado c, String letra){
        int nletrasEncontradas = buscar(c, letra);
        boolean bandera = false;
        if (nletrasEncontradas>0) {
            c.setnLetrasEncontradas(c.getnLetrasEncontradas()+nletrasEncontradas);
            bandera = true;
        }
        System.out.println("Así va la frase: ");
        System.out.println(Arrays.toString(c.getPalabraAux()));
        System.out.println("Hasta ahora has encontrado "+ c.getnLetrasEncontradas()+" letra/letras");         
        System.out.println("Te falta encontrar "+(longitud(c)-c.getnLetrasEncontradas())+" letra/letras");        
        return bandera; 
    }
    
    public void intentos(Ahorcado d, boolean r){       
        if (r==false) {
            d.setnJugadasMax(d.getnJugadasMax()-1);            
        }        
        System.out.println("Te quedan "+d.getnJugadasMax() +" oportunidades");  
    }
    
    public void juego(Ahorcado e){
        
        System.out.println("La cantidad de letras que tiene la palabra es: "+longitud(e));        
        do {
            System.out.println("Ingresa una letra");
            String letra = leer.next();              
            int cont = 0; 
            
            for (int i = 0; i < e.getPalabraAux().length; i++) { 
                if (letra.equalsIgnoreCase(e.getPalabraAux()[i])) {
                    cont ++;                    
                }           
            }
            if (cont >0) {
                System.out.println("Esta letra ya la has ingresado antes. Intenta nuevamente");
            } else{
                boolean respuestaEncontradas = (encontradas(e, letra)); 
                intentos(e, respuestaEncontradas); 
                System.out.println("----------------------------------------------");
            }            
           
        } while (e.getnLetrasEncontradas()<longitud(e) && e.getnJugadasMax()>0); 
        
        if (e.getnLetrasEncontradas()==longitud(e)) {
            System.out.println("FELICITACIONES!!! Has descubierto la palabra :) ");            
        } else {
            System.out.println("No has descubierto la palabra :( ");            
        }
        System.out.print("La palabra es: ");
        for (int i = 0; i < e.getPalabra().length; i++) {
            System.out.print(e.getPalabra()[i]);
        }
        System.out.println("");

    } 
    
    
}