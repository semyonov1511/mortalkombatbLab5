package Game_components;

public class Result {
    
    private String name;
    private int points;
    
    public Result(String n, int p){
        this.name=n;
        this.points=p;
    }
    
    public void setName(String s){
        this.name=s;
    }
    public void setPoints(int p){
        this.points=p;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPoints(){
        return this.points;
    }
    
}
