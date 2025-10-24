
//Clase para representar la unión entre dos NodoGrafo 
public class Arista {
    NodoGrafo  origen;
    NodoGrafo  destino;
    int peso;

    
    public Arista(NodoGrafo  origen, NodoGrafo  destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }//Arista


    public NodoGrafo  getOrigen() {
        return origen;
    }


    public void setOrigen(NodoGrafo origen) {
        this.origen = origen;
    }


    public NodoGrafo estino() {
        return destino;
    }


    public void setDestino(NodoGrafo destino) {
        this.destino = destino;
    }


    public int getPeso() {
        return peso;
    }


    public void setPeso(int peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Arista [origen=" + origen + ", destino=" + destino + ", peso=" + peso + "]";
    }

    
    
}//Arista
