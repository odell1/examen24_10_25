public class MiPilila {
    
    //Propiedades
    private NodoPila cima; //Nodo que representa la cima de la pila
    private int tamanio; //Tamaño actual de la pila

    //Constructor
    public MiPilila() {
        this.cima = null; // Inicialmente, la pila está vacía
        this.tamanio = 0; // Tamaño inicial es 0
    }//Constructor


    //getter tamanio
    public int getTamanio(){
        return tamanio;
    }

    //Averiguamos si está vacía
    public boolean esVacia(){

        if(cima==null) return true;
        else return false;
        /*
       if(tamanio==0) return true;
        else return false; 
         */

    }//esVacia


    //Método push. Método de meter
    public void push(int elemento){
       NodoPila nuevoNodo=new NodoPila(elemento);
        if(esVacia()){ //Es el primer nodo que metemos
        
            nuevoNodo.setSiguiente(null); //El siguiente del nuevo nodo es null cima.setSiguiente(null);
        }else{
            nuevoNodo.setSiguiente(cima); //El siguiente del nuevo nodo es la cima
        
        }//if
        cima=nuevoNodo;
        tamanio++;
        System.out.println(" Añadimos el el elemento: "+elemento + " a la pila.");   

    }//push


    //Método pop. Método de sacar.
    public int pop(){
        //Si está vacía
        if(esVacia()) return -1;

        int dato=cima.getDato();
        cima=cima.getSiguiente();
        tamanio--;
        return dato;


    }//pop

    // Método para recorrer todos los elementos, pero sin sacarlos!!!!!!
    // Imprimirlos
    public void imprimirElementos() {
        if (esVacia()) {
            System.out.println("La pila está vacía, alma de pollo!!!!");
            return;
        } //if
        System.out.println("Hay tanto " + tamanio + " elementos en la pila.");
        System.out.println("Elementos en la pila:");
        NodoPila actual = cima;
        while (actual != null) {
            System.out.println("- " + actual.getDato());
            actual = actual.getSiguiente();
        }//while
    }//imprimirElementos



}//miPilila
