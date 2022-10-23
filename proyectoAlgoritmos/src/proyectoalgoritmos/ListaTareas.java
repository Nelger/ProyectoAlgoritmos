
package proyectoalgoritmos;


public class ListaTareas {
   private String nombre;
   private int identificador;
   private int identificadorTablero;
   private String nombreTablero;
    public ListaTareas() {
    }

    public ListaTareas(String nombre, int identificador, int identificadorTablero, String nombreTablero) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.identificadorTablero = identificadorTablero;
        this.nombreTablero = nombreTablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificadorTablero() {
        return identificadorTablero;
    }

    public void setIdentificadorTablero(int identificadorTablero) {
        this.identificadorTablero = identificadorTablero;
    }

    public String getNombreTablero() {
        return nombreTablero;
    }

    public void setNombreTablero(String nombreTablero) {
        this.nombreTablero = nombreTablero;
    }

   
   
}
