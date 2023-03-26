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
public class Contenido extends Entretenimiento {
    private String nombre;
    private String tipo;

    public Contenido(String nombre, String tipo, String director, String descripcion, boolean contenido, String cadena) {
        super(director, descripcion, contenido, cadena);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Contenido() {
       super();
       this.nombre = "";
       this.tipo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
