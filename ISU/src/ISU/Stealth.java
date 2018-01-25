package ISU;

import java.util.Random;
import javax.swing.JOptionPane;

//Child Class 2 - Stealth Class, extends the parent class
public class Stealth extends MotherBase {

    private Random rand = new Random();
    protected int SRnD = 0; //Stealth research skill

    //Real Constructor
    public Stealth(String RN) {
        super(RN + " - Stealth Operator");
    }

    //Default Constructor
    public Stealth() {
        super();
    }

    //Exclusive Reasearch Stealth Ability, increases morale and Stealth skill
    public void StealthRnD() {
        SRnD += (int) (Math.random() * 15 + 1);
        MoraleUp();
    }

    //getter for exclusive
    public int getSRnD() {
        return SRnD;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
