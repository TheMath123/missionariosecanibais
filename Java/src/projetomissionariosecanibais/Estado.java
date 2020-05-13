
package projetomissionariosecanibais;

import java.util.ArrayList;

/**
 *
 * @author Matheus P. Agostinho <mat.matheus.p.agostinho@gmail.com>
 */

public class Estado {
    private int missionariosEsq; // 0 a n missionários - margem esquerda
    private int canibaisEsq; // 0 a n canibais - margem esquerda
    private int missionarioDir; //margem direita
    private int canibalDir; //margem direita
    
    private boolean bote; //"false" - Direita / "true" - Esquerda
    Estado pai;//Armazena o estado de origem - Obs.: Caso tiver.
    
    public boolean eValido(){
        return missionariosEsq >= 0 && missionarioDir >= 0 && canibaisEsq >= 0 && canibalDir >= 0 
                && (missionariosEsq == 0 || missionariosEsq >= canibaisEsq) 
                && (missionarioDir == 0 || missionarioDir >= canibalDir);
    }
    
    public boolean testeObjetivo(){
        return missionariosEsq == 0 && canibaisEsq == 0;
    }
    
    public ArrayList<Estado> geraSucessores(){
        ArrayList<Estado> sucessores = new ArrayList<>();
        if(!bote){ //Move da margem esquerda para direita
            podeAdd(sucessores, new Estado(missionariosEsq-1, canibaisEsq-1, missionarioDir+1, canibalDir+1, true)); //Move 1 missionario e 1 canibal para margem direita.
            podeAdd(sucessores, new Estado(missionariosEsq-1, canibaisEsq, missionarioDir+1, canibalDir, true)); //Move 1 missionario para margem direita;
            podeAdd(sucessores, new Estado(missionariosEsq, canibaisEsq-1, missionarioDir, canibalDir+1, true)); //Move 1 canibal para margem direita
            podeAdd(sucessores, new Estado(missionariosEsq-2, canibaisEsq, missionarioDir+2, canibalDir, true)); //Move 2 missionarios para margem direita
            podeAdd(sucessores, new Estado(missionariosEsq, canibaisEsq-2, missionarioDir, canibalDir+2, true)); //Move 2 canibal para margem direita
        }else{ //move da margem direita para esquerda
            podeAdd(sucessores, new Estado(missionariosEsq-1, canibaisEsq-1, missionarioDir+1, canibalDir+1, false)); //Move 1 missionario e 1 canibal para margem esquerda.
            podeAdd(sucessores, new Estado(missionariosEsq-1, canibaisEsq, missionarioDir+1, canibalDir, false)); //Move 1 missionario para margem esquerda;
            podeAdd(sucessores, new Estado(missionariosEsq, canibaisEsq-1, missionarioDir, canibalDir+1, false)); //Move 1 canibal para margem esquerda
            podeAdd(sucessores, new Estado(missionariosEsq-2, canibaisEsq, missionarioDir+2, canibalDir, false)); //Move 2 missionarios para margem esquerda
            podeAdd(sucessores, new Estado(missionariosEsq, canibaisEsq-2, missionarioDir, canibalDir+2, false)); //Move 2 canibal para margem esquerda
        }
        return sucessores;
    }
    
    public void podeAdd(ArrayList<Estado> sucessores, Estado novo){
        if(novo.eValido()){
            novo.setPai(this);
            sucessores.add(novo);
        }
    }
    
    //Construtor
    public Estado(int missionariosEsq, int canibaisEsq, int missionarioDir, int canibalDir, boolean bote) {
        this.missionariosEsq = missionariosEsq;
        this.canibaisEsq = canibaisEsq;
        this.missionarioDir = missionarioDir;
        this.canibalDir = canibalDir;
        this.bote = bote;
    }
    //

    //Métodos gets e sets
    public int getMissionarioEsq() {
        return missionariosEsq;
    }
    public void setMissionarioEsq(int missionariosEsq) {
        this.missionariosEsq = missionariosEsq;
    }

    public int getCanibalEsq() {
        return canibaisEsq;
    }
    public void setCanibalEsq(int canibaisEsq) {
        this.canibaisEsq = canibaisEsq;
    }

    public int getMissionarioDir() {
        return missionarioDir;
    }
    public void setMissionarioDir(int missionarioDir) {
        this.missionarioDir = missionarioDir;
    }

    public int getCanibalDir() {
        return canibalDir;
    }
    public void setCanibalDir(int canibalDir) {
        this.canibalDir = canibalDir;
    }

    public boolean isBote() {
        return bote;
    }
    public void setBote(boolean bote) {
        this.bote = bote;
    }

    public Estado getPai() {
        return pai;
    }
    public void setPai(Estado pai) {
        this.pai = pai;
    }
    //


    @Override
    public String toString() {
        //"false" - Direita / "true" - Esquerda
        if(bote){
            return "[M: " + missionariosEsq + "| C: " + canibaisEsq + "| Bote Esquerda |M: "+ missionarioDir + "| C: "+ canibalDir +"]";
        }else{
            return "[M: " + missionariosEsq + "| C: " + canibaisEsq + "| Bote Direita |M: "+ missionarioDir + "| C: "+ canibalDir +"]";
        }
    }

}
