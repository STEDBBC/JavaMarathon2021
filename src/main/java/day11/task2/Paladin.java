package day11.task2;

public class Paladin extends Hero implements Healer {

    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT=20;
    public Paladin() {
        pDef = 0.5;
        mDef = 0.2;
        pAttack = 15;
    }


    @Override
    public void healHimself() {
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_AMOUNT;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health+HEAL_TEAMMATE_AMOUNT >MAX_HEALTH){
            hero.health = 100;
        }else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
