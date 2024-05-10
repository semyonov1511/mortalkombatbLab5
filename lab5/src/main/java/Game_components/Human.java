package Game_components;

public class Human extends Player {

    private int points;
    private int experience;
    private int win;
    private int nextexperience;

    public Human(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        this.points = 0;
        this.experience = 0;
        this.nextexperience = 40;
        this.win = 0;
    }

    public int getPoints() {
        return this.points;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getNextExperience() {
        return this.nextexperience;
    }

    public int getWin() {
        return this.win;
    }

    public void resetPoints() {
        this.points = 0;
    }
    
    public void setPoints(int p) {
        this.points += p;
    }

    public void resetExperience() {
        this.experience = 0;
    }

    public void setExperience(int e) {
        this.experience += e;
    }

    public void setNextExperience(int e) {
        this.nextexperience = e;
    }

    public void setWin() {
        this.win++;
    }

    @Override
    public String getName() {
        return "You";
    }

}
