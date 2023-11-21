
package GUI_MODULO;

public class TipoPedido {
    
    private String Tipo1;
    private String Tipo2;

    public TipoPedido(){
    }

    
    public TipoPedido(String Tipo1, String Tipo2) {
        this.Tipo1 = Tipo1;
        this.Tipo2 = Tipo2;
    }

    public String getTipo1() {
        return Tipo1;
    }

    public void setTipo1(String Tipo1) {
        this.Tipo1 = Tipo1;
    }

    public String getTipo2() {
        return Tipo2;
    }

    public void setTipo2(String Tipo2) {
        this.Tipo2 = Tipo2;
    }
    
    
}
