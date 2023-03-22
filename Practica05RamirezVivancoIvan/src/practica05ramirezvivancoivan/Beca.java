/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica05ramirezvivancoivan;

/**
 *
 * @author Usuario
 */
public class Beca {
    private String nombre;
    private String comentarios;
    private boolean bibliografia;
    private boolean material;
    private boolean transporte;
    private int tipoBeca;

    public Beca(String nombre,
            String comentarios,
            boolean bibliografia,
            boolean material,
            boolean transporte,
            int tipoBeca) {
        this.nombre = nombre;
        this.comentarios = comentarios;
        this.bibliografia = bibliografia;
        this.material = material;
        this.transporte = transporte;
        this.tipoBeca = tipoBeca;
    }

    public Beca(){
        this.nombre = "SN";
        this.tipoBeca = 0;
        this.bibliografia = false;
        this.material  = false;
        this.transporte = false;
        this.comentarios = "SC";
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public boolean isBibliografia() {
        return bibliografia;
    }

    public boolean isMaterial() {
        return material;
    }

    public boolean isTransporte() {
        return transporte;
    }

    public int getTipoBeca() {
        return tipoBeca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setBibliografia(boolean bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

    public void setTipoBeca(int tipoBeca) {
        this.tipoBeca = tipoBeca;
    }
    
    
}
