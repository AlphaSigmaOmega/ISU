package ISU;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public abstract class MotherBase implements Comparable {

    protected String CName, Name, Rank;
    protected int FA, Morale, HP, Cost, WinLose;
    Random rand = new Random();

    public MotherBase(String RN) {
        pickCName();
        Name += " " + RN;
        FA = rand.nextInt(15) + 1;
        rankCalc(FA);
        Morale = 10;
        HP = 10;
    }

    public MotherBase() {
        CName = "";
        Name = "";
        Rank = "";
        FA = 0;
        Morale = 0;
        HP = 0;

    }

    protected final int FAUp(int FA) {
        int FightA = FA;
        FightA += Math.random() * 10 + 1;
        return FightA;
    }

    protected final void MoraleUp() {
        Morale += Math.random() * 5 + 1;
    }

    public final void Eat() {
        MoraleUp();
        HP++;
    }

    public final void Train() {
        FAUp(FA);
        rankCalc(FA);
        MoraleUp();
    }

    public void Mission() {
        WinLose = rand.nextInt(2) + 1;
        if (WinLose == 1) { //Win Condition
            FAUp(FA);
            rankCalc(FA);
            MoraleUp();
        } else if (WinLose == 2) { //Lose Condition
            Morale -= 5;
            HP--;
        }
    }

    public String getName() {
        return Name;
    }

    public String getRank() {
        return Rank;
    }

    public int getFA() {
        return FA;
    }

    public int getHP() {
        return HP;
    }

    public int getMorale() {
        return Morale;
    }

    public String toString() {
        return "Name: " + Name + "\nRank: " + Rank + "\n========\n";
    }

    protected void rankCalc(int FightAbility) {
        int FAB = FightAbility;
        if (FAB >= 1 && FAB <= 15) {
            Rank = "E";
        } else if (FAB >= 16 && FAB <= 31) {
            Rank = "D";
        } else if (FAB >= 32 && FAB <= 47) {
            Rank = "C";
        } else if (FAB >= 48 && FAB <= 63) {
            Rank = "B";
        } else if (FAB >= 64 && FAB <= 79) {
            Rank = "A";
        } else if (FAB >= 80 && FAB <= 109) {
            Rank = "A+";
        } else if (FAB >= 110 && FAB <= 184) {
            Rank = "A++";
        } else if (FAB >= 185 && FAB <= 289) {
            Rank = "S";
        } else if (FAB >= 290 && FAB <= 447) {
            Rank = "S+";
        } else if (FAB >= 448) {
            Rank = "S++";
        }
    }

    private void pickCName() {
        try {
            FileReader fr = new FileReader("C:\\Users\\tibbl\\Documents\\NetBeansProjects\\ISU\\ISU\\src\\Names.txt");
            //having problems finding file with FileReader, can't just find "Names.txt"
            //but does work with direct file path
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            System.out.println(randName);
            MotherBase S;
            int n = rand.nextInt(210) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            CName = randName;
        } catch (Exception e) {
            CName = "FAILED";
        }
        Name = CName;
        /*try {
            FileReader fr = new FileReader("LastNames.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            MotherBase S;
            int n = rand.nextInt(605) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            LName = randName;
        } catch (Exception e) {
        }*/
    }

}
