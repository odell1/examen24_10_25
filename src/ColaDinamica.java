public class ColaDinamica {
   //Propiedades
   private Proceso frente; //Referencia al primer nodo
   private Proceso fin; //Referencia al último nodo
   private int tamanio;


   public ColaDinamica() {
    this.frente = null;
    this.fin = null;
    this.tamanio = 0;
   }//ColaDinamica


   public boolean esVacia(){
    if(tamanio==0) return true; else return false;
   // (tamanio==0)?return true:return false;
   }//esVacia

   /* Método para encolar */
   public void encolar(Proceso aux){
    //1º comprobamos si la cola está vacía
    if(this.esVacia()) {
        //Es el primer nodo que metemos.
        this.frente=this.fin=aux;
        aux.setSiguiente(null);
    }else
    {
        this.fin.setSiguiente(aux);
        fin=aux;
    }//if
    this.tamanio++;
    System.out.println("Hemos añadido un proceso a la cola "+ aux.toString());

   }//encolar

   /* Método para desencolar */
   public Proceso desencolar(){
        if(this.esVacia()) return null;
        Proceso elemento=frente;
        frente=frente.getSiguiente();
        tamanio--;
        return elemento;
               
   }//desencolar



   /*
    * Getter & Setters
    */
   public Proceso getFrente() {
    return frente;
   }


   public void setFrente(Proceso frente) {
    this.frente = frente;
   }


   public Proceso getFin() {
    return fin;
   }


   public void setFin(Proceso fin) {
    this.fin = fin;
   }


   public int getTamanio() {
    return tamanio;
   }


   public void setTamanio(int tamanio) {
    this.tamanio = tamanio;
   }



   @Override
   public String toString() {
    return "ColaDinamica [frente=" + frente + ", fin=" + fin + ", tamanio=" + tamanio + "]";
   }


   public char[] toTodo() {
    String resultado="";
    Proceso aux=frente;
    while(aux!=null){
        resultado+=aux.getNombre()+"\n";
        aux=aux.getSiguiente();
    }
    return resultado.toCharArray(); 
   }//toTodo
   
   

   


}//ColaDinamica
