/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_components;

/**
 *
 * @author Мария
 */
public class Items {
    
    private String name;
    private int count;
    
    public Items(String n, int c){
        this.name=n;
        this.count=c;
    }
    
    public void setName(String s){
        this.name=s;
    }
    public void setCount(int c){
        this.count+=c;
    }
    
    public String getName(){
        return this.name;
    }
    public int getCount(){
        return this.count;
    }
}
