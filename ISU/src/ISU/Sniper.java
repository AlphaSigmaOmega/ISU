package ISU;


import java.util.Random;


public class Sniper extends MotherBase{
    
    private Random rand = new Random();
    protected int RF= 0;
    
    public Sniper(String RN){
        super(RN + " - Sniper Operator");
    }
    
    public Sniper(){
        super();
    }
    
    public void setName(String RN){
        Name += RN + " - Sniper Operator";
    }
    
    public void RangeFinding(){
        RF+= (int) (Math.random() * 15 + 1);
        MoraleUp();
    }
    
    public int getRF(){
        return RF;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
