/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coby_
 */
public class SumaValores {
    public static void main(String[] args) {
        int cantidades[]={20,10,5,30,25,15,4,6,8,12};
        int total=SumaValores(cantidades, 0);
    System.out.println(total);
    }
static int SumaValores(int[] cantidades, int indice){
   if (cantidades.length-1==indice)
       return cantidades [indice];
   else 
       return cantidades [indice]+SumaValores(cantidades,indice+1);
    
}

}

    
