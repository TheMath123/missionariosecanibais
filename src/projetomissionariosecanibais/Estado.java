/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

public class Estado {
    private int missionario; // 0 a n missionários
    private int canibal; // 0 a n canibais
    private boolean bote; //"false" - Direita / "true" - Esquerda
    
    //Remove 1 missionário ou canibal
    public boolean remove1Tipo(boolean tipo){
        Estado temporario = this;
        if(tipo){ //true = missionário
            temporario.setMissionario(temporario.getMissionario()-1);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
                setMissionario(missionario-1);
                return true;
            }else{
                return false;
            }
        }else{ //false =canibal
            temporario.setMissionario(temporario.getMissionario()-1);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
                setCanibal(canibal-1);
                return true;
            }else{
                return false;
            }
        }
    }
    
    //Remove 2 missionários ou canibais
    public boolean remove2Tipo(boolean tipo){
        Estado temporario = this;
        if(tipo){ //true = missionário
            temporario.setMissionario(temporario.getMissionario()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
                setMissionario(missionario-2);
                return true;
            }else{
                return false;
            }
        }else{ //false =canibal
            temporario.setMissionario(temporario.getMissionario()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
                setCanibal(canibal-2);
                return true;
            }else{
                return false;
            }
        }
    }
    
    //Remove 1 de cada
    public boolean remove1Cada(){
        Estado temporario = this;
        temporario.setMissionario(temporario.getMissionario()-1);
        temporario.setCanibal(temporario.getCanibal()-1);
        if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
            setMissionario(missionario-1);
            setCanibal(canibal-1);
            return true;
        }else{
            return false;
        }
    }
    
    //Construtor
    public Estado(int missionario, int canibal, boolean bote) {
        this.missionario = missionario;
        this.canibal = canibal;
        this.bote = bote;
    }//
    
    //Métodos gets e sets
    public int getMissionario() {
        return missionario;
    }
    public void setMissionario(int missionario) {
        this.missionario = missionario;
    }

    public int getCanibal() {
        return canibal;
    }
    public void setCanibal(int canibal) {
        this.canibal = canibal;
    }

    public boolean isBote() {
        return bote;
    }
    public void setBote(boolean bote) {
        this.bote = bote;
    }
    //


    @Override
    public String toString() {
        return "[M: " + missionario + "| C: " + canibal + "| B: " + bote + "]\n";
    }

    
    
}
