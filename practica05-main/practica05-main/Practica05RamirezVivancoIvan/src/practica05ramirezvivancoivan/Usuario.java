/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica05ramirezvivancoivan;

/**
 *
 * @author Usuario
 */
class Usuario {
    private String usuario;
    private String contra;

    public Usuario(String usuario,
            String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
