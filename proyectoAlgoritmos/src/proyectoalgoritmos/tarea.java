
package proyectoalgoritmos;

import java.util.Date;


public class tarea {
    private String nombre;
    private String Descripcion;
    private int identificador;
    private int identificaroListaTarea;
    private int posicion;
    Date fecha;
    private String comentario;
    private String etiqueta;
    private String nombreLista;
    private String nombreTablero;

    
    public tarea() {
    }

    public tarea(String nombre, String Descripcion, int identificador, int identificaroListaTarea, int posicion, Date fecha, String comentario, String etiqueta, String nombreLista, String nombreTablero) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.identificador = identificador;
        this.identificaroListaTarea = identificaroListaTarea;
        this.posicion = posicion;
        this.fecha = fecha;
        this.comentario = comentario;
        this.etiqueta = etiqueta;
        this.nombreLista = nombreLista;
        this.nombreTablero = nombreTablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificaroListaTarea() {
        return identificaroListaTarea;
    }

    public void setIdentificaroListaTarea(int identificaroListaTarea) {
        this.identificaroListaTarea = identificaroListaTarea;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getNombreTablero() {
        return nombreTablero;
    }

    public void setNombreTablero(String nombreTablero) {
        this.nombreTablero = nombreTablero;
    }
     
}
