
package datos;
/**
 * Clase que me permite almacenar los datos de la calificacion
 * @author coby_
 */
public class Calificacion {
    
    private String clave; 
    private String nombre; 
    private int semetre; 
    private double calificacion; 

    
     public String[] obttenerFilaTabla(){
        String[] datos = new String[4]; 
        datos[0] = clave; 
        datos[1] = nombre; 
        datos[2] = "" + semetre; 
        datos[3] = String.format("%.2f", calificacion);
        return datos; 
    }

    @Override
    public String toString() {
        return "Calificacion{" + "clave=" + clave + ", nombre=" 
                + nombre + ", semetre=" + semetre + 
                ", calificacion=" + calificacion + '}';
    }
     
    public Calificacion(String clave, String nombre, int semetre, double calificacion) {
        this.clave = clave;
        this.nombre = nombre;
        this.semetre = semetre;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemetre() {
        return semetre;
    }

    public void setSemetre(int semetre) {
        this.semetre = semetre;
    }
    
    
    
    
}
