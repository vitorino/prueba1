/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacioncompleto;

import java.util.Random;

/**
 *
 * @author avanza
 */
public class OrdenaListas {
    
    int[] lista;
    int[] listaOrdenada;
    int size;
    
    
    public OrdenaListas(){
     //System.out.println("HOLA SOY EL CONSTRUCTOR!!!");   
        int i=0;        
        Random aleatorios = new Random();
        for (i=0;i<100;i++)
            lista[i]=aleatorios.nextInt(100);
    }

    
    public OrdenaListas(int tamanyo){
     //System.out.println("HOLA SOY EL CONSTRUCTOR!!!");   
        int i=0;
        size=tamanyo;
        lista=new int[size];
        listaOrdenada=new int[size];
        
        Random aleatorios = new Random();
        for (i=0;i<tamanyo;i++)
            lista[i]=aleatorios.nextInt(tamanyo);
    }
    
    
    public void mostrarLista(){
    
        int i=0;
        
        for (i=0;i<size;i++)
            System.out.print(lista[i]+"-");
        System.out.print("\n");
    } 

    
    public void mostrarListaOrdenada(){
    
        int i=0;
        
        for (i=0;i<size;i++)
            System.out.print(listaOrdenada[i]+"-");
        System.out.print("\n");
    } 
    
    
    public void ordenarBurbuja(){
        int i=0;
        boolean ordenado=false;
        int antes,despues,aux;
        
        while ((i<=(size-1)) && (ordenado==false))
        {
            antes=0;
            despues=1;
            ordenado=true;
            for (antes=0;antes<=(size-2);antes++)
            {
                //comparar antes y despues
                if (lista[antes]>lista[despues])
                {
                    aux=lista[antes];
                    lista[antes]=lista[despues];
                    lista[despues]=aux;                
                    ordenado=false;
                }
                //aumentardespues en 1
                despues++;
            }      
            i++;
        }
    }
    
    
    public void ordenarSeleccion(){
        int i=0,j=0,contadorMenores,contadorIguales;
        
        for (i=0;i<size;i++)
        {
            j=0;
            contadorMenores=0;
            contadorIguales=0;
            while (j<size)
            {
                if (lista[i]==lista[j])
                    contadorIguales++;
                if (lista[i]>lista[j])
                    contadorMenores++;
                j++;
            }
            //En contadorMenores tendré el numero
            //de digitos menores que lista[i]
            //if (contadorIguales>1)
            for (j=2;j<=contadorIguales;j++)
                listaOrdenada[contadorMenores+(j-1)]=lista[i];
                
            listaOrdenada[contadorMenores]=lista[i];
        }
    }
    
    
    public void ordenarInsercion(){
        int i=0,j=0;
        
        for (i=0;i<size;i++)
            listaOrdenada[i]=size+1;
	
	j=0;
	i=0;
	listaOrdenada[j]=lista[i];
        int numeroAInsertar;
        int indiceMagico;
	for (i=1;i<size;i++){
            //Averiguar la posicion donde va a insertarse
            //listaU[i]
            numeroAInsertar=lista[i];
            indiceMagico=0;
            while ( (numeroAInsertar>listaOrdenada[indiceMagico] && listaOrdenada[indiceMagico]!=(size+1)))
                indiceMagico++;
            //indiceMagico va a contener la posicion 
            //donde hay que insertar el numeroaInsertar
            if (listaOrdenada[indiceMagico]==(size+1))//la celda esta vacia
            {
                listaOrdenada[indiceMagico]=numeroAInsertar;
            }else //la celda esta ocupada
            {
                //Desplazo los numeros 1 posicion:
                int indiceCeldaVacia=0;
                while (listaOrdenada[indiceCeldaVacia]!=(size+1))
                    indiceCeldaVacia++;
                indiceCeldaVacia--;
                for (int l=indiceCeldaVacia;l>=indiceMagico;l--)
                    listaOrdenada[l+1]=listaOrdenada[l];
                listaOrdenada[indiceMagico]=numeroAInsertar;
            }
	}
    
    
    
    }
    
    
}
