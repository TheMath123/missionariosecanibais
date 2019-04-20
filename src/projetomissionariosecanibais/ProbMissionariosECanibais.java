/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

import java.util.Scanner;

public class ProbMissionariosECanibais {

    public static void main(String[] args) {
        Estado atual = new Estado(3, 3, false);
        Estado objetivo = new Estado(0, 0, true);

        int quantMC = entradaAlg();
        if(quantMC != -1){
            Busca profundidade = new Busca(new Estado(quantMC, quantMC));
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
