/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author coby_
 */
public class Operaciones {
public String saludoMayus(String nombre){
     String cadM=nombre.toUpperCase();
String cadFinal= cadM + " HOLA!";
return cadFinal;
}
public int incrementar(int num){
   int num2=num+1;
   return num2;
}
public int sumar(int num1,int num2){
int s=num1+num2;
return s;
}
public int sumar(int num1,int num2,int num3){
int s=num1+sumar(num2,num3);
return s;
}
}