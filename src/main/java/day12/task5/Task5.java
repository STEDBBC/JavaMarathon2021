package day12.task5;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List <MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Chester Bennington",31));
        members1.add(new MusicArtist("David Farrell",32));
        members1.add(new MusicArtist("Bradford Delson",33));
        members1.add(new MusicArtist("Joseph Hahn",34));
        members1.add(new MusicArtist("Michael Shinoda",38));

        MusicBand band1 = new MusicBand("linkin parl",1996,members1);

        List <MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Deryck Whibley",22));
        members2.add(new MusicArtist("Jason McCaslin",27));
        members2.add(new MusicArtist("Tom Thacker",25));
        members2.add(new MusicArtist("Dave Baksh",38));
        members2.add(new MusicArtist("Frank Zummo",33));

        MusicBand band2 = new MusicBand("sum 41",1996,members2);

        band1.listMembers();
        band2.listMembers();

        MusicBand.transfer(band1,band2);

        band1.listMembers();
        band2.listMembers();


    }
}
