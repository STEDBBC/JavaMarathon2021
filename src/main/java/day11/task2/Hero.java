package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    int pAttack;
    double pDef;
    double mDef;
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = pAttack * (1- hero.pDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
   }
}
