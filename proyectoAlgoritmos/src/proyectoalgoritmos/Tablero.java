
package proyectoalgoritmos;

public class Tablero {
    private String nombre;
    private int identificador;

    public Tablero() {
    }

    public Tablero(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }
// get recupera la informacion de un objeto
    public String getNombre() {
        return nombre;
    }
// el set de asiganga el valor al atributo 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
}
