/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

import java.util.ArrayList;


public class Busca { //Arvore de busca
    
    Estado estadoInicial;
    Estado estadoFinal;
    ArrayList<Estado> proxEstados;
    ArrayList<Estado> caminho;
    int custo;
    ArrayList<No> nosVisitados;
 
    //Verifica se estado atual é o objetivo.
    public boolean testObjetivo(Estado atual){
        if(atual.equals(estadoFinal)){
            return true;
        }else{
            return false;
        }
    }

    //Métodos gets e sets.
    public Estado getEstadoInicial() {
        return estadoInicial;
    }
    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public Estado getEstadoFinal() {
        return estadoFinal;
    }
    public void setEstadoFinal(Estado estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public ArrayList<Estado> getProxEstados() {
        return proxEstados;
    }
    public void setProxEstados(ArrayList<Estado> proxEstados) {
        this.proxEstados = proxEstados;
    }

    public ArrayList<Estado> getCaminho() {
        return caminho;
    }
    public void setCaminho(ArrayList<Estado> caminho) {
        this.caminho = caminho;
    }

    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }

    public ArrayList<No> getNosVisitados() {
        return nosVisitados;
    }
    public void setNosVisitados(ArrayList<No> nosVisitados) {
        this.nosVisitados = nosVisitados;
    }//
    
    
    
    
}