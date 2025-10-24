public class App {


    public static void main(String[] args) throws Exception {
  
        

        //----------------- Ejercicio 2 B ----------------- 
        ColaDinamica cola=new ColaDinamica();
        Proceso p1=new Proceso("Proceso 1");
        Proceso p2=new Proceso("Proceso 2");
        Proceso p3=new Proceso("Proceso 3");
        cola.encolar(p1);
        cola.encolar(p2);
        cola.encolar(p3);
        System.out.println(cola.desencolar().getNombre());
        System.out.println(cola.toTodo());

        // ----------------- Ejercicio 3 A -----------------
        String expresion="2 3 + 4 5 - *";
        evaluarExpresion(expresion);

        // --------------- Ejercicio 4 A------------------
        HistorialAcciones historial=new HistorialAcciones();
        historial.ejecutarAccion("copiar");
        historial.ejecutarAccion("pegar");
        historial.ejecutarAccion("cortar");
        historial.ejecutarAccion("pegar");
        historial.deshacerUltima();
        historial.deshacerUltima(); 
        historial.deshacerUltima();
        historial.deshacerUltima();
        historial.deshacerUltima(); //Debe dar error

        // ----------------- Ejercicio 6 A -----------------
        int[] datos = {15,22,18,30,25,17,19,21};
        QuickSortMitad ordenar=new QuickSortMitad(datos);
        System.out.println("Antes de ordenar:");
        ordenar.mostrarArray();
        
        ordenar.quickSort(ordenar.arr, 0, ordenar.arr.length - 1);
        

        System.out.println("Después de ordenar:");
        ordenar.mostrarArray();
    
        






    }//main
///////////////////////
/// 
/// Métodos
    private static void evaluarExpresion(String expresion) {
        MiPilila pila=new MiPilila();
        String[] elementos=expresion.split(" ");
        for(String elem:elementos){
            if(elem.equals("+") || elem.equals("-") || elem.equals("*") || elem.equals("/")){
                int b=pila.pop();
                int a=pila.pop();
                int resultado=0;
                switch(elem){
                    case "+":
                        resultado=a+b;
                        break;
                    case "-":
                        resultado=a-b;
                        break;
                    case "*":
                        resultado=a*b;
                        break;
                    case "/":
                        resultado=a/b;
                        break;
                }//switch
                pila.push(resultado);
            }else{//Es un número!!!! 

                int numero=Integer.parseInt(elem);
                pila.push(numero);
            }//if
        }//for

        int resultadoFinal=pila.pop();//Sacamos el resulado final
        System.out.println("El resultado de la expresión '"+expresion+"' es: "+resultadoFinal);


    }//evaluarExpresion


}//App
