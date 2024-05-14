package Particular_Actions;

public class Debuff extends Action {

    @Override
    public String isAttack() {
        return "1";
    }

    @Override
    public String isBlock() {
        return "0";
    }
}
