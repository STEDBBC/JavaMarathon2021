package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Chester Bennington");
        members1.add("David Farrell");
        members1.add("Bradford Delson");
        members1.add("Joseph Hahn");
        members1.add("Michael Shinoda");
        MusicBand musicBand1 = new MusicBand("Linkin park", 1996, members1);
        List<String> members2 = new ArrayList<>();
        members2.add("Deryck Whibley");
        members2.add("Jason McCaslin");
        members2.add("Tom Thacker");
        members2.add("Dave Baksh");
        members2.add("Frank Zummo");
        MusicBand musicBand2 = new MusicBand("Sum 41", 1996, members2);

        musicBand1.listMembers();
        musicBand2.listMembers();

        MusicBand.transfer(musicBand1,musicBand2);

        musicBand1.listMembers();
        musicBand2.listMembers();


    }
}
