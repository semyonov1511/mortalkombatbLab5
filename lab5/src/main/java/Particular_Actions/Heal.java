package Particular_Actions;

public class Heal extends Action {

    @Override
    public String isHit() {
        return "1";
    }

    @Override
    public String isDefense() {
        return "0";
    }
}
