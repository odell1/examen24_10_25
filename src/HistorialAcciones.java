import java.util.Stack;

public class HistorialAcciones {

    private Stack<String> pilaAcciones;

    public HistorialAcciones() {
        this.pilaAcciones = new Stack<>();

    } // Constructor

    public void ejecutarAccion(String accion) {
        pilaAcciones.push(accion);
        System.out.println("Ejecutada " + accion );
    }//ejecutarAccion

    public String deshacerUltima() {
        if (pilaAcciones.isEmpty()) {
            System.out.println("No hay acciones para deshacer.!pila¡");
            return null;
        }//if
        
        String accionDeshecha = pilaAcciones.pop();
        System.out.println("Deshecha la acción:" + accionDeshecha);
        return accionDeshecha;
    }//deshacerUltima
}//HistorialAcciones
