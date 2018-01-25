

import java.util.Random;

public class Stealth extends MotherBase{
    
    private Random rand = new Random();
    protected int sSkill= 0;
    
    public Stealth(String RN){
        super(RN + " - Stealth Operator");
    }
    
    public Stealth(){
        super();
    }
    
    public void ReName(String RN){
        Name += RN + " - Stealth Operator";
    }
    
    public void SRnD(){
        sSkill+= (int) (Math.random() * 15 + 1);
        
    }
    
    public void Smission() {
        int WinLose=rand.nextInt(2) + 1;
        if (WinLose==1){ //Win Condition
            FAUp(FA);
            rankCalc(FA);
            MoraleUp(Morale);
        }
        else if (WinLose==2){ //Lose Condition
            Morale-=5;
            HP--;
        }
        
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
