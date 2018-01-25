package ISU;

import java.util.Random;

//Child Class 1 - Sniper Class, extends the parent class
public class Sniper extends MotherBase{
    
    private Random rand = new Random();
    protected int RF= 0; //Range Finding Skill int
    
    //Real Constructor
    public Sniper(String RN){
        super(RN + " - Sniper Operator");
    }
    
    //Default Constructor
    public Sniper(){
        super();
    }
    
    //Exclusive Rangefinding Reasearch ability, increases morale & Range Finding Skill
    public void RangeFinding(){
        RF+= (int) (Math.random() * 15 + 1);
        MoraleUp();
    }
    
    //getter for exclusive
    public int getRF(){
        return RF;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
