package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Василий");
        User user2 = new User("Иван");
        User user3 = new User("Алексей");

        user1.sendMessage(user2,"Привет, как дела?");
        user1.sendMessage(user2,"Чем занимаешь?");

        user2.sendMessage(user1,"Привет Vas9");
        user2.sendMessage(user1,"у меня все отлично");
        user2.sendMessage(user1,"как сам?");

        user3.sendMessage(user1,"Привет, меня зовут Алексей ");
        user3.sendMessage(user1,"Помнишь меня?");
        user3.sendMessage(user1,"мы учились в школе");

        user1.sendMessage(user3,"привет Алексей");
        user1.sendMessage(user3,"я тебя помню");
        user1.sendMessage(user3,"Рад видеть что ты жив здоров");
        user1.sendMessage(user3,"Давай встреимся где нибудь сегодня вечером?");

        user3.sendMessage(user1,"да, давай после 5 наберу тебе");

        MessageDatabase.showDialog(user1,user3);

    }
}
