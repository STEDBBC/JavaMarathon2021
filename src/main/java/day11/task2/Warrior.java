package day11.task2;

public class Warrior extends Hero {

    public Warrior(){
        pDef = 0.8;
        pAttack = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
