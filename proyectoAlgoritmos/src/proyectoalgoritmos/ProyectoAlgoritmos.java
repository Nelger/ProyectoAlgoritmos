
package proyectoalgoritmos;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoAlgoritmos {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        String nombre;
        double identificador;
        boolean menu=false; 
                System.out.println("******** PROGRAMA DE TAREAS************ \n"
                + " Seleccione una de las opciones:");
                
        // menu principal         
        while( !menu){
            System.out.println("***********************************************************");
            System.out.println("########## MENU PRINCIPAL ##########");
            System.out.println("1. Menu tableros");
            System.out.println("2. Menu lista de tareas");
            System.out.println("3. Menu tarea");
            System.out.println("4. Salir");
            System.out.println("***********************************************************");
            Scanner inputs = new Scanner( System.in );
        //captura de datos por teclado
        opcion = inputs.nextInt();
       // System.out.print(" dato ingresado: "+opcion );
        switch(opcion){
            case 1 :
                //metodo para crear tableros 
                tableros();
                break;
            case 2:
                 listaTareas();
                break;
            case 3:
                tareas();
                break;
            case 4:
                menu = true;
                break;
        }
        }
    }
    
  // crear un metodo para generar los numero de idenficador  
    static ArrayList<Tablero> listaTablero = new ArrayList();//array list del objeto tablero
    static public void tableros(){
       
        boolean menu = false;
        int opcion;
        String nombre;
        int identificador;
         
        while(!menu){
            System.out.println("***********************************************************");
            System.out.println("########## MENU DE TABLEROS ##########");
            System.out.println("1. Crear Tablero");
            System.out.println("2. Modificar tablero");
            System.out.println("3. Eliminar tablero");
            System.out.println("4. Ver Tableros");
            System.out.println("5. Salir");
             System.out.println("***********************************************************");
            Scanner inputs = new Scanner( System.in );
            opcion = inputs.nextInt();
            switch (opcion){
                case 1:
                     System.out.println("creando nuevo tablero");
                identificador = (int)(Math.random()*100+1);
                    System.out.println("Ingrese el nombre del tablero");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if( nombre.equals("") ){
                        System.out.println("ERROR DEBE DE INGRESAR UN NOMBRE:");
                    }else{
                        Tablero tablero = new Tablero(); // instancia de clase de los tableros
                        tablero.setNombre(nombre);
                        tablero.setIdentificador(identificador);
                        listaTablero.add(tablero);
                    }
                 break;
                case 2:
                    System.out.println("Ingrese el nombre del tablero que desea modificar");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if(nombre.equals("")){
                        System.out.println("Error ingrese el nombre del tablero");
                    }else{
                        for(int i=0; i<listaTablero.size(); i++ ){
                            if( nombre.equals(listaTablero.get(i).getNombre()) ){
                                System.out.println("Ingrese el nuevo nombre del tablero");
                                nombre = inputs.nextLine();
                                listaTablero.get(i).setNombre(nombre);
                                break;
                            }
                        }
                    }
                   break;
                case 3:
                    System.out.println("Ingrese el nombre del tablero que desea Eliminar");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if(nombre.equals("")){
                        System.out.println("Error ingrese el nombre del tablero");
                    }else{
                        int identificadorAux = 0;
                        int listaAux=0;
                            for(int i=0; i<listaTablero.size(); i++ ){
                                if( nombre.equals( listaTablero.get(i).getNombre())){
                                    identificadorAux = listaTablero.get(i).getIdentificador();
                                    listaTablero.remove(i);
                                }
                                //break;
                            }
                           
                            for(int j =(listaTareas.size()-1);  j>=0 ; j-- ){
                                if( identificadorAux == listaTareas.get(j).getIdentificadorTablero()){
                                    System.out.println(" ELIMINE LISTA  "+ listaTareas.get(j).getNombre() );
                                    listaAux = listaTareas.get(j).getIdentificador();
                                    listaTareas.remove(j);
                                }
                            }
                            
                            for( int k = (nuevasTareas.size()-1); k>=0 ; k-- ){
                                if( listaAux == nuevasTareas.get(k).getIdentificaroListaTarea()){
                                    System.out.println(" ELIMINE TAREA:  "+ nuevasTareas.get(k).getNombre() );
                                    nuevasTareas.remove(k);
                                }
                            }
                        
                        }
                   break;
                    
                case 4:
                    for(int i=0; i<listaTablero.size() ; i++ ){
                        System.out.println("***********************************************************");
                        System.out.println("NOMBRE DEL TABLERO: "+ listaTablero.get(i).getNombre());
                        System.out.println("IDENTIFICADOR TABLERO: "+listaTablero.get(i).getIdentificador());
                        System.out.println("***********************************************************");
                    }
                    break;
                case 5:
                    menu = true;
                    break;
                case 6:
                    System.out.println("##############################################");
                    for(int j =0;  j<listaTareas.size() ; j++ ){
                        
                                System.out.println("nombre lista:  "+ listaTareas.get(j).getNombre());
                            }
                    break;
                    
            }
        }
    }
     
static  ArrayList< ListaTareas> listaTareas = new ArrayList();
static public void listaTareas(){
     if(listaTablero.size() == 0 ){
       System.out.println("ERROR DEBER DE CREAR UN TABLERO PRIMERO:");
    }else{
    boolean menu = false;
        int opcion;
        String nombre;
        String nombreTablero;
        String nombreTablero2;
        int identificador;
        int identificadorTablero=0;
     while(!menu){
         System.out.println("***********************************************************");
            System.out.println("########## MENU DE LISTA TAREAS ##########");
            System.out.println("1. Crear Lista tareas");
            System.out.println("2. Modificar Lista tareas");
            System.out.println("3. Eliminar Lista tareas");
            System.out.println("4. Ver Lista tareas");
            System.out.println("5. Salir");
            System.out.println("***********************************************************");
            Scanner inputs = new Scanner( System.in );
            opcion = inputs.nextInt();
            switch (opcion){
                case 1:
                            
                            System.out.println("Ingrese el nombre de la lista de tareas");
                                nombre = inputs.nextLine();
                                nombre = inputs.nextLine();
                                identificador = (int)(Math.random()*100+1);    
                             System.out.println("Ingrese el nombre del tablero al que va apertenecer esta lista : ");
                                nombreTablero = inputs.nextLine();
                            for(int i =0; i< listaTablero.size(); i++ ){
                                    if(listaTablero.get(i).getNombre().equals(nombreTablero) ){
                                        identificadorTablero = listaTablero.get(i).getIdentificador();
                                        nombreTablero2 = listaTablero.get(i).getNombre();
                                        ListaTareas listaTarea = new ListaTareas();
                                        listaTarea.setNombre(nombre);
                                        listaTarea.setIdentificador(identificador);
                                        listaTarea.setIdentificadorTablero(identificadorTablero);
                                        listaTarea.setNombreTablero(nombreTablero2);
                                        listaTareas.add(listaTarea);
                                        System.out.println("EL NUMERO DE IDENTIFICADOR DEL TABLERO ES: "+identificadorTablero);
                                        break;
                                    }else{
                                        System.out.println("ERROR NO EXISTE UN TABLERO CON ESE NOMBRE");
                                    }
                                }
                            
                        break;
                case 2: 
                     System.out.println("Ingrese el nombre de la lista de tareas al que desea modificar");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if(nombre.equals("")){
                        System.out.println("Error ingrese el nombre del tablero");
                    }else{
                        for(int i=0; i<listaTareas.size(); i++ ){
                            if( nombre.equals(listaTareas.get(i).getNombre()) ){
                                System.out.println("Ingrese el nuevo nombre de la lista de tareas");
                                nombre = inputs.nextLine();
                                listaTareas.get(i).setNombre(nombre);
                                break;
                            }
                        }
                    }
                   break;
                case 3: 
                     System.out.println("Ingrese el nombre de la lista de tareas que desea Eliminar");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if(nombre.equals("")){
                        System.out.println("Error ingrese el nombre de la lista ");
                        
                    }else{
                        int identificarAxu=0;
                        for(int i=0; i<listaTareas.size(); i++ ){
                            if( nombre.equals(listaTareas.get(i).getNombre()) ){
                                identificarAxu = listaTareas.get(i).getIdentificador();
                                listaTareas.remove(i);
                                System.out.println("######## Tablero eliminado #######");
                            }
                            
                        }
                        for(int j = (nuevasTareas.size()-1 ) ; j >=0; j--){
                            if( identificarAxu == nuevasTareas.get(j).getIdentificaroListaTarea() ){
                                System.out.println("######## Tarea eliminada: "+ nuevasTareas.get(j).getNombre());
                                nuevasTareas.remove(j);                               
                            }
                        }
                    }
                   break;
                case 4:
                    for(int i=0; i< listaTareas.size() ; i++ ){
                        System.out.println("***********************************************************");
                        System.out.println("NOMBRE DE LA LISTA: "+listaTareas.get(i).getNombre());
                        System.out.println("IDENTIFIACDOR DE LA LISTA: "+listaTareas.get(i).getIdentificador());
                        System.out.println("IDENTIFIACDOR DEL TABLERO : "+listaTareas.get(i).getIdentificadorTablero());
                        System.out.println("NOMBRE TABLERO : "+listaTareas.get(i).getNombreTablero());
                        System.out.println("***********************************************************");
                    }
                case 5: 
                    menu = true;
                    break;
           }
        }
     }
  }

static ArrayList<tarea> nuevasTareas = new ArrayList();
static void tareas(){
    if(listaTareas.size() == 0 ){
        System.out.println("Error debe de crear una lista de tareas primero");
    }else{
        boolean menu = false;
        int opcion; 
        while(!menu){
            System.out.println("***********************************************************");
            System.out.println("########## MENU DE TAREAS ##########");
            System.out.println("1. Crear Tarea");
            System.out.println("2. Modificar Tarea");
            System.out.println("3. Eliminar Tarea");
            System.out.println("4. Ver Lista tareas");
            System.out.println("5. Salir");
             System.out.println("***********************************************************");
            Scanner inputs = new Scanner( System.in );
            opcion = inputs.nextInt();
            switch (opcion){
                case 1: 
                    String nombre;
                    String descripcion;
                    int identificador;
                    int identificadorLista;
                    String nombreLista;
                    int posicion;
                    String comentario;
                    System.out.println("Ingrese el nombre de la tarea");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    System.out.println("Ingrese la descripcion de la tarea");
                    descripcion = inputs.nextLine();
                    identificador = (int)(Math.random()*100+1);
                    System.out.println("Ingrese el nombre de la lista de tareas al que va a pertenecer");
                    nombreLista = inputs.nextLine();
                    for(int i =0; i< listaTareas.size(); i++ ){
                        if(listaTareas.get(i).getNombre().equals(nombreLista) ){
                            identificadorLista = listaTareas.get(i).getIdentificador();
                             posicion = ( nuevasTareas.size()+1);
                             System.out.println(" ingresar comentario a la tarea");
                             comentario = inputs.nextLine();
                             tarea tarea = new tarea();//instancia de la clase tarea
                             tarea.setNombre(nombre);
                             tarea.setDescripcion(descripcion);
                             tarea.setIdentificador(identificador);
                             tarea.setIdentificaroListaTarea(identificadorLista);
                             tarea.setComentario(comentario);
                             tarea.setNombreLista( listaTareas.get(i).getNombre());
                             tarea.setNombreTablero( listaTareas.get(i).getNombreTablero());
                             nuevasTareas.add(tarea); // agrego la nueva tarea a la lista 
                        }else{
                            System.out.println("ERROR NO EXISTE LA LISTA CON ESE NOMBRE");
                        }
                    }
                    break;
                case 2:
                     System.out.println("Ingrese el nombre de la tarea al que desea modificar");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if(nombre.equals("")){
                        System.out.println("Error ingrese el nombre de la tarea");
                    }else{
                        for(int i=0; i<nuevasTareas.size(); i++ ){
                            if( nombre.equals(nuevasTareas.get(i).getNombre()) ){
                                System.out.println("Ingrese el nuevo nombre de  la tareas");
                                nombre = inputs.nextLine();
                                nuevasTareas.get(i).setNombre(nombre);
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                     System.out.println("Ingrese el nombre de la tarea que desea Eliminar");
                    nombre = inputs.nextLine();
                    nombre = inputs.nextLine();
                    if(nombre.equals("")){
                        System.out.println("Error ingrese el nombre de la lista ");
                        
                    }else{
                        for(int i=0; i<nuevasTareas.size(); i++ ){
                            if( nombre.equals(nuevasTareas.get(i).getNombre()) ){
                                nuevasTareas.remove(i);// se elimina la tarea 
                                System.out.println("######## Traea eliminada #######");
                                break;
                            }
                        }
                    }
                    
                    break;
                case 4:
                    for(int i=0; i< nuevasTareas.size() ; i++ ){
                        System.out.println("***********************************************************");
                        System.out.println("NOMBRE DE LA  TAREA: "+nuevasTareas.get(i).getNombre());
                        System.out.println("IDENTIFIACDOR DE LA TAREA: "+nuevasTareas.get(i).getIdentificador());
                        System.out.println("IDENTIFIACDOR DE LA LISTA DE TAREAS: "+nuevasTareas.get(i).getIdentificaroListaTarea());
                        System.out.println("POSICION DE LA TRAREA: "+nuevasTareas.get(i).getPosicion() );
                        System.out.println("NOMBRE DE LA LSITA : "+nuevasTareas.get(i).getNombreLista());
                        System.out.println("NOMBRE DEL TABLERO : "+nuevasTareas.get(i).getNombreTablero() );
                        System.out.println("***********************************************************");
                    }
                    
                    break;
                case 5: 
                    menu = true;
                    break;
                    
            }
            
        }
        
       
    }
}


}
