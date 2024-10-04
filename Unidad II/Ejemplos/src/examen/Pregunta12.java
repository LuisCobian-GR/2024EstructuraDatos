/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author coby_
 */
public class Pregunta12 {
    
      public static void main(String[] args) {
        imprimirOrdenInverso(4);
    }
    
    
    private static void imprimirOrdenInverso(int n){
        System.out.println(n);
        if (n==0) return; 
        else imprimirOrdenInverso(n-1); 
    }
    
}
