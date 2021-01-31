package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    int mAttack = 15;
    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMMATE_AMOUNT=30;

    public Shaman() {
        pDef = 0.2;
        mDef = 0.2;
        pAttack = 10;


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
            hero.health = MAX_HEALTH;
        }else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = mAttack * (1- hero.mDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
