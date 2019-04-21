/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

import projetomissionariosecanibais.algoritmos.Busca;
import java.util.Scanner;
import projetomissionariosecanibais.algoritmos.Largura;

public class ProbMissionariosECanibais {

    public static void main(String[] args) {

        int quantMC = entradaAlg();
        if(quantMC != -1){
            Estado inicial = new Estado(quantMC, quantMC);
            Largura profundidade = new Largura(inicial);
            if(profundidade.buscarCaminho(inicial)){
                profundidade.imprimeCaminho();
            }
        }else{
            System.out.println("ERRO: Quantidade de criaturas inválida.");
        }
        
    }
    
    public static int entradaAlg(){
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite a quantidade criaturas (Obs.: Somente número pares): ");
        int quantCriaturas = tec.nextInt();
        if(quantCriaturas%2 == 0){
           return quantCriaturas /= 2;
        }else{
            return -1;
        }
    }
}
