/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacioncompleto;

/**
 *
 * @author avanza
 */
import java.util.Calendar;


public class Cronometro {
    
    long tiempoInicio;
    long tiempoFin;
    Calendar ahora;
    
    public Cronometro() {
        tiempoInicio=0;
        tiempoFin=0;
        
        //ahora.setTimeInMillis(0);
    }
    
    public void iniciarCrono(){
        ahora = Calendar.getInstance();
        tiempoInicio = ahora.getTimeInMillis();    
    }
    
    public void pararCrono(){
        ahora = Calendar.getInstance();
        tiempoFin = ahora.getTimeInMillis();        
    }
    
    public long obtenerTiempoTranscurrido(){
        //long x=tiempoFin-tiempoInicio;
        //System.out.println(x);
        return (tiempoFin-tiempoInicio);
    }
    
}
