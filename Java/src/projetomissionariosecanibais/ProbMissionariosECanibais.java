
package projetomissionariosecanibais;

import algoritmos.Largura;
import java.util.ArrayList;

/**
 *
 * @author Matheus P. Agostinho <mat.matheus.p.agostinho@gmail.com>
 */

public class ProbMissionariosECanibais {

    public static void main(String[] args) {
        Largura buscar = new Largura();
        Estado solucao;
        solucao = buscar.buscaLargura(new Estado(3, 3, 0, 0, false));
        imprimeCaminho(solucao);
    }
    
    public static void imprimeCaminho(Estado solucao){
        if(solucao == null){
            System.out.println("Ops! Não encontrei uma solução.");
        }else{
            System.out.println("Caminho:");
            ArrayList<Estado> caminho = new ArrayList<>();
            Estado temp = solucao;
            while(temp != null){
                caminho.add(temp);
                temp = temp.getPai();
            }
            int viagens = caminho.size()-1;
            for (int i = viagens; i >= 0 ; i--) {
                temp = caminho.get(i);
                if(temp.testeObjetivo()){
                    System.out.print(temp.toString());
                }else{
                    System.out.print(temp.toString()+" > ");
                }
            }
            System.out.println("\nViagens: "+viagens);
        }
    }
}
