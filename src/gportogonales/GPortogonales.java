/*
 Se desea realizar un programa que compruebe si dos vectores de 10.
 elementos cada uno son ortogonales.
 Los valores de los vectores deben ser suministrados por el teclado
 Dos vectores son ortogonales o perpendiculares si su producto escalar es cero.    
  A · B = AxBx + AyBy = 0
 */
package gportogonales;

import java.util.Scanner;

/* @author gpacheco */
public class GPortogonales {
    
    public static void main(String[] args) {
        //Definir los vectores y variavles 
        int[] vectorA = new int[10];
        int[] vectorB = new int[10]; 
        int escalar = 0;
        Scanner leer = new Scanner(System.in);//Objeto para ller datos por teclasdo 
        
        //Leer los datos para el vector 1
        System.out.println("** Numero para Vector A **");     
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el " + (i+1) + " numero: " );     
            vectorA[i]= leer.nextInt();
        }
        
        //Leer los datos del vector 2
        System.out.println("** Numero para Vector B **");     
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el " + (i+1) + " numero: " );     
            vectorB[i]= leer.nextInt();
        }
        
        //Calular el prododucto Escalar de los vectores
        for (int i = 0; i < 10;i++){
            escalar += (vectorA[i] * vectorB[i] );
        }
        
        //Comprovar si son ortogenales
        if (escalar == 0){
            System.out.println("Los Vectores son Ortogenales");
        }else{
            System.out.println("Los Vectores NO son Ortogenales");
        }      
   }
    
}
