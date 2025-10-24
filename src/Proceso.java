public class Proceso {
    private String nombre;
    private Proceso siguiente;
    
    
    
    public Proceso(String nombre, Proceso siguiente) {
        this.nombre = nombre;
        this.siguiente = siguiente;
    }
    
    public Proceso(String nombre) {
        this.nombre = nombre;
    }

    public Proceso() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Proceso getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Proceso siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Proceso [nombre=" + nombre + "]";
    };


    
}//Proceso

