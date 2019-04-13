/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

public class Estado {
    private int missionario; // 0 a n missionários
    private int canibal; // 0 a n canibais
    private boolean bote; //"false" - Direita / "true" - Esquerda
    
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
