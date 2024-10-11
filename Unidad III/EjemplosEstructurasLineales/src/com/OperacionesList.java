/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.util.ArrayList;

/**
 *
 * @author coby_
 */
public class OperacionesList {
    
    public static void main(String[] args) {
        //declara una lista de nombres
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ariadna"); // agrega elementos 
        lista.add("Mayra"); 
        lista.add("Sara"); 
        lista.add("Juanita"); 
        lista.add("Panchita"); 
        System.out.println("El tamaño: " + lista.size());
        System.out.println("Vacía?" + lista.isEmpty()); 
        System.out.println("Se encuentra Mayra " + lista.contains("Mayra"));
        lista.remove("Ariadna"); 
        System.out.println("Valor:" + lista.get(0));
        lista.set(0, "Sara");
        System.out.println("Lista de los valores ");
        //for(int i = 0; i< lista.size();i++){
        for(String elemento : lista){
            System.out.println(elemento);
        }
        
    }
    
}
