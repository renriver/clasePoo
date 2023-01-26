
package modificadoAcceso;

/**
 *como manejar el modificador de acceso tipo protected
 * 
 */
public class modifProtected {
    private String privada;
    protected String protegido;
    public String publico;

    public modifProtected() {
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getProtegido() {
        return protegido;
    }

    public void setProtegido(String protegido) {
        this.protegido = protegido;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }
    
}
