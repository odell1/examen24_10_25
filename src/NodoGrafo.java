
//Clase para representar un nodo del grafo

public class NodoGrafo {
    int id; //Identificador del nodo
    String nombre;
    
    public NodoGrafo(int id, String nombre){
        this.id=id;
        this.nombre=nombre;

    }//Nodo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nodo Grafo [id=" + id + ", nombre=" + nombre + "]";
    }
       


}//Nodo
