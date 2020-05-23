/*
 Implemente un algoritmo que le permita: 
1).Deplegar el nombre de su paper.
2).Qué es un a red neuronal.
3).Cuáles son los elementos que forman una red neuronal.
4).Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5).Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto.
6).En qué consistió el entrenamiento utilizando una red neuronal, indique el algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author Junior
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        System.out.println("          UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE             ");
        System.out.println("Autor: Junior Steven Cangui Toapanta"); 
        System.out.println("NRC:7450");
        System.out.println("Fecha: 21/05/2020");
        System.out.println("                     TRABAJO EN CLASE \n");
        
        System.out.println("Ingrese el nombre de su paper:");
        String nombre=objeto.nextLine (); 
        
        System.out.println("¿Qué es una red neuronal?");
        String red=objeto.nextLine ();
        
        System.out.println("¿Cuáles son los elementos que forman una red neuronal?");
        String elementos=objeto.nextLine ();
        
        System.out.println("¿Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado?");
        String utilizacion=objeto.nextLine ();
        
        System.out.println("¿Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto?");
        String mejorar=objeto.nextLine ();
        
        System.out.println("¿En qué consistió el entrenamiento utilizando una red neuronal, indique el algoritmo utilizado?");
        String entrenamiento=objeto.nextLine ();
        
        System.out.println("           GRACIAS POR SU ATENCION            ");
        
        
    }
    
}
