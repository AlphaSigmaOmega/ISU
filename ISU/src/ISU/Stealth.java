package ISU;

import java.util.Random;
import javax.swing.JOptionPane;

public class Stealth extends MotherBase {

    private Random rand = new Random();
    protected int SRnD = 0;

    public Stealth(String RN) {
        super(RN + " - Stealth Operator");
    }

    public Stealth() {
        super();
    }

    public void setName(String RN) {
        Name += RN + " - Stealth Operator";
    }

    public void StealthRnD() {
        SRnD += (int) (Math.random() * 15 + 1);
        MoraleUp();
    }

    public int getSRnD() {
        return SRnD;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
