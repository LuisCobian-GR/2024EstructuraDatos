/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author coby_
 */
public class ActividadFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arreglo[] = {"a", "b","k", "c", "d"};
        System.out.println("Dame el nombre a buscar: ");
        String valor = sc.nextLine(); 
        
        int posicion = -1; 
        for(int i = 0; i< arreglo.length; i++){
            if(arreglo[i].equals(valor))
            {
                posicion = i;
                break; /// detiene el ciclo del siguiente nivel 
            } // if 
        } // for   
        if(posicion == -1)
            System.out.println("El nombre no fue encontrado");
        else 
            System.out.println("El nombre que buscas esta en " + posicion);
    } // main
    
}
