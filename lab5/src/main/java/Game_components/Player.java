package Game_components;

import javax.swing.ImageIcon;

public class Player {
    
    private int level;
    private int health;
    private int maxhealth;
    private int damage;
    private int attack;
    public ImageIcon icon;
    
    public Player(int level, int health, int damage, int attack){
        this.level=level;
        this.health=health;
        this.damage=damage;
        this.attack=attack;
        this.maxhealth=health;
    }
    
    public void setPhoto(String path){
        icon = new ImageIcon(path);
    }
   
    public ImageIcon getPhoto(){
        return icon;
    }
    public void setLevel(){
        this.level++;
    }
    public void setHealth(int h){
        this.health+=h;
    }
    public void setNewHealth(int h){
        this.health=h;
    }
    public void setDamage(int d){
        this.damage+=d;
    }
    public void setAttack(int a){
        this.attack=a;
    }
    public void setMaxHealth(int h){
        this.maxhealth+=h;
    }
    
    public int getLevel(){
        return this.level;
    }
    public int getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getMaxHealth(){
        return this.maxhealth;
    }
    
    public String getName(){
        return "";
    }
    
}
