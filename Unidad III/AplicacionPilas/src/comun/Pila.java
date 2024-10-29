package comun;

/**
 * Clase para controlar las operaciones con la pila 
 * @author coby_
 */
public class Pila {
    
    private String[] nombres;
    private int tope; 
    private final int max; 

    public Pila(int max) {
        this.max = max;
        nombres = new String[max]; 
        this.tope = -1; 
    }
    
    public String peek(){
        String valor = ""; 
        if(tope>=0){
            valor = nombres[tope];
        } else{
            System.out.println("No hay valores en la pila");
        } 
      return valor;       
    }

    public int getTope() {
        return tope;
    }
    
    public String pop() {
        String value = ""; 
        if(tope>=0){ // si hay un valor 
            value  = nombres[tope];
            tope--;
        }else {
            System.out.println("Que no hay valores en la pila");
        }
        return value; 
    }
    
    public void push(String nombre){
        
        if(tope<max-1){ // todavía espacio
            tope ++; 
            nombres[tope] = nombre; 
        } else {
            System.out.println("La pila ya no acepta valores");
        }
        
    }
    
    
}
