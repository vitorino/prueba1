/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacioncompleto;

/**
 *
 * @author avanza
 */
public class OrdenacionCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador1;
        int contador2;
        int contador3;
        
        //OrdenaListas ordenacion = new OrdenaListas();
        //ordenacion.mostrarLista();
        //ordenacion.ordenarBurbuja();
        //ordenacion.mostrarLista();
        //ordenacion.ordenarInsercion();
        //ordenacion.mostrarListaOrdenada();
        /*Cronometro crono = new Cronometro();
        crono.iniciarCrono();
        
        for (int i=0;i<=50000;i++)
            System.out.println(".");
        
        crono.pararCrono();
        System.out.println("El tiempo transcurrido es:"+(long) crono.obtenerTiempoTranscurrido());*/
        OrdenaListas miObjeto = new OrdenaListas(25);
        miObjeto.mostrarLista();
        /*miObjeto.ordenarBurbuja();
        miObjeto.mostrarLista();*/
        miObjeto.ordenarSeleccion();
        miObjeto.mostrarListaOrdenada();
    }
}
