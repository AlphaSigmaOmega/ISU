
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public abstract class MotherBase implements Comparable {

    protected String CName,Name,Rank;
    protected int FA, Morale, HP, Cost, WinLose;
    private Random rand = new Random();

    public MotherBase(String RN) {
        pickCName();
        Name += " " + RN;
        FA = rand.nextInt(15) + 1;
        rankCalc(FA);
        int Morale = 10;
        HP=10;
        }
    
    public MotherBase(){
        CName="";
        Name="";
        Rank="";
        FA=0;
        Morale=0;
        HP=0;
        
    }

    protected final int FAUp(int FA) {
        int FightA=FA;
        FightA+=Math.random()*10+1;
        return FightA;
    }
    protected final int MoraleUp(int Morale){
        int MO=Morale;
        MO+=Math.random()*5+1;
        return MO;
    }

    public final void Eat() {
        MoraleUp(Morale);
        HP++;
    }

    public final void Train() {
        FAUp(FA);
        rankCalc(FA);
        MoraleUp(Morale);
    }
    public String getName(){
        return Name;
    }
    public String getRank(){
        return Rank;
    }
    public String getFA(){
        String F = String.valueOf(FA);
        return F;
    }
    public String getHP(){
        String H = String.valueOf(HP);
        return H;
    }
    public String getMorale(){
        String M = String.valueOf(Morale);
        return M;
    }
    
    public String toString(){
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
            FileReader fr = new FileReader("FirstNames.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            MotherBase S;
            int n = rand.nextInt(210) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            CName = randName;
        } catch (Exception e) {
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

    private void pickRank() {
        try {
            FileReader fr = new FileReader("RankList.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            MotherBase S;
            int n = rand.nextInt(10) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            Rank = randName;
        } catch (Exception e) {
        }
    }

   
}
