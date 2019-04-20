/* @Matheus P. Agostinho */

package projetomissionariosecanibais.algoritmos;

import java.util.ArrayList;
import projetomissionariosecanibais.Estado;


public class Busca { //Arvore de busca
    
    Estado estadoInicial;
    Estado estadoObjetivo;
    ArrayList<Estado> fronteira;
    ArrayList<Estado> caminho;
    int custoTotal = 0;
 
    //Verifica se estado atual é o objetivo.
    public boolean testeObjetivo(Estado atual){
        if(atual.equals(estadoObjetivo)){
            return true;
        }else{
            return false;
        }
    }

    //Impremi o caminho percorrido
    public void imprimeCaminho(){
        System.out.println(estadoInicial);
        for(int est=caminho.size()-1;est>=0;est--){
            System.out.println(caminho.get(est).toString());
        }
        System.out.println("Custo do caminho: " + caminho.get(0).getCusto());
    }
    //Método construtor
    public Busca(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
        fronteira.add(estadoInicial);
        this.estadoObjetivo = new Estado(0, 0, true);
    }
    
    //Metodos gets e sets
}