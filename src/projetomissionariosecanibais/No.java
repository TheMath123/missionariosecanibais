/* @Matheus P. Agostinho */

package projetomissionariosecanibais;


public class No {
    private Estado atual;
    private Estado pai;
    private int custoCaminho;

    //Método construtor
    public No(Estado atual, Estado pai, int custoCaminho) {
        this.atual = atual;
        this.pai = pai;
        this.custoCaminho = custoCaminho;
    }
    
    
    //Métodos gets e sets
    public Estado getAtual() {
        return atual;
    }
    public void setAtul(Estado atul) {
        this.atual = atul;
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
