package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90, 100, 0);
        Player player2 = new Player(random.nextInt(11) + 90, 100, 0);
        Player player3 = new Player(random.nextInt(11) + 90, 100, 0);
        Player player4 = new Player(random.nextInt(11) + 90, 100, 0);
        Player player5 = new Player(random.nextInt(11) + 90, 100, 0);
        Player player6 = new Player(random.nextInt(11) + 90, 100, 0);
        player1.info();
        Player player7 = new Player(random.nextInt(11) + 90, 100, 0);
        System.out.println("Игроков на поле все равно : " + player7.getCountPlayers());
        for (int i =player1.getStamina();i>=0;i++){
            Player.run(player1);
        }
        System.out.println("Игроков на поле: " + player7.getCountPlayers());
        }
    }


class Player {
    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina, int MAX_STAMINA, int MIN_STAMINA) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers >= 6) {
            countPlayers = 6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    static void run(Player playerRun) {
        playerRun.stamina = playerRun.stamina - 1;
       // System.out.println(playerRun.stamina);
        if (playerRun.stamina == playerRun.MIN_STAMINA) {
            countPlayers--;
        }
    }

    void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные, на поле  есть еще: " + (6 - countPlayers) + "  свободных мест");
        } else System.out.println("На поле нет свободных мест");

    }
}

