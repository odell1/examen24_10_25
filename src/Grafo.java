
//Clase principal del Grafo

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Grafo {
   private Map<Integer, NodoGrafo> nodos;
   private Map<Integer, List<Arista>> adyacencias; //Cercanos
   private boolean dirigido;
   
   public Grafo(boolean dirigido){
        this.nodos=new HashMap<>();
        this.adyacencias=new HashMap<>();
        this.dirigido=dirigido;
   }//Grafo

   //Agregamos un nodo al grafo
   public void agregarNodo(int id, String nombre){
        NodoGrafo nodo=new NodoGrafo(id, nombre);
        nodos.put(id, nodo);
        adyacencias.putIfAbsent(id,new ArrayList<>());

   }//agregarNodo

   //Agregamos arista, o camino, o carretera o lo que quieras
   public void agregarArista(int idOrigen, int idDestino, int peso){
        NodoGrafo origen=nodos.get(idOrigen);
        NodoGrafo destino=nodos.get(idDestino);

        //Comprobamos que existen
        if(origen!=null && destino!=null){
            //Se crea una arista de origen a destino - No es bidireccional 
            adyacencias.get(idOrigen).add(new Arista(origen, destino, peso));//Get conseguimos la lista de 
            //adyacencia del nodo origen y le agregamos la arista
            
            if(!dirigido){
                adyacencias.get(idDestino).add(new Arista( destino,origen, peso));//Get conseguimos la lista de 
            }//2º if

        }//if

   }//agregarArista


    //Método para mostrar el grafo
    public void mostrar(){
        System.out.println("\n Mostrando grafo que es gerundio "+ (dirigido  ? " Dirigido " : " NO Dirigido"));
        for( int id:adyacencias.keySet()){
            System.out.println(nodos.get(id) + "---");
            for(Arista arista :adyacencias.get(id)){
                System.out.println(arista.destino.nombre + " peso: "+ arista.peso);
            }//2º for
            System.out.println();
        }//for

    }//mostrar

/**************** No hace falta que os lo miréis **********************/
    //búsqueda en profundidad (DFS Deep First Search)
    public void busquedaProfundidad(int idInicio){
            Set<Integer> visitados=new HashSet<>();//Nodos visitados que no debemos recorrer -- Cerrados
            Stack<Integer> pila=new Stack<>(); //pila de nodos que nos faltan por recorrer -- Abiertos
            
            pila.push(idInicio);
            System.out.println("Empezamos a recorrer el árbol desde "+nodos.get(idInicio));

            while(!pila.isEmpty()){
                int idActual=pila.pop();

                //Comprobamos si este nodo lo he visitado
                if(!visitados.contains(idActual)){
                    // si no lo contiene lo visitamos
                    visitados.add(idActual);
                    System.out.println(nodos.get(idActual)+ " ");

                    //Como estoy visitando este nodo. Tengo que ver qué nodoso puedo visitar. 
                    // ¿cómo lo miro? ==> en aristas
                    List<Arista> aristas=adyacencias.get(idActual);
                    for (int i = 0; i < aristas.size(); i++) {
                        int idVecino=aristas.get(i).destino.getId();//consigo el id del vecino
                        //Comprobamos si el vecino que acabo de coger lo hemos visitado ya
                        if(!visitados.contains(idVecino)) {
                            pila.push(idVecino);//Añadimos para vistarlo
                        }
                    }//for

                }//if


            }//while

    }//busquedaProfundidad


}//Grafo
