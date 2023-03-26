/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05ramirezvivancoivan;

/**
 *
 * @author ivanc
 */
public class Entretenimiento {
    private String director;
    private String descripcion;
    private boolean contenido;
    private String cadena;

    public Entretenimiento(String director, String descripcion, boolean contenido, String cadena) {
        this.director = director;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.cadena = cadena;
    }

    public Entretenimiento(){
        
    }
    
    public String getDirector() {
        return director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isContenido() {
        return contenido;
    }

    public String getCadena() {
        return cadena;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setContenido(boolean contenido) {
        this.contenido = contenido;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
}
