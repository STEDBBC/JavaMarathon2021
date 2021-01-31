package day11.task2;

public class Magician extends Hero implements MagicAttack{

    int mAttack = 20;

    public Magician(){
        pDef = 0;
        mDef = 0.8;
        pAttack = 5;

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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
