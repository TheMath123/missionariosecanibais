
package projetomissionariosecanibais;


public class No {
    private Estado estado;
    private Estado pai;
    private int custoCaminho;

    public No(Estado estado, Estado pai, int custoCaminho) {
        this.estado = estado;
        this.pai = pai;
        this.custoCaminho = custoCaminho;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getPai() {
        return pai;
    }
    public void setPai(Estado pai) {
        this.pai = pai;
    }

    public int getCustoCaminho() {
        return custoCaminho;
    }
    public void setCustoCaminho(int custoCaminho) {
        this.custoCaminho = custoCaminho;
    }

    
    
}
