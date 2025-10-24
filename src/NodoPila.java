/// Clase Nodo para representar cada elemento de la cola
public class NodoPila {
    private int dato;
    private NodoPila siguiente; // Enlace al siguiente nodo

    //Constructor
    public NodoPila(int dato) {
        this.dato = dato;
        this.siguiente = null; // Inicialmente, el siguiente es null !ojo! se ha de poner siempre así
    }//Constructor

    //Getters y Setters

    public void setDato(int dato) {
        this.dato = dato;
    }   
    
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    public NodoPila getSiguiente() {
        return siguiente;
    }
    public int getDato() {
        return dato;
    }



}//Nodo
