package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Linkin Park", 1996);
        MusicBand band2 = new MusicBand("Imagine Dragons", 2008);
        MusicBand band3 = new MusicBand("Sum41", 1996);
        MusicBand band4 = new MusicBand("Kaleida", 2013);
        MusicBand band5 = new MusicBand("Nickelback", 1995);
        MusicBand band6 = new MusicBand("Rob Zombie", 1985);
        MusicBand band7 = new MusicBand("Каста", 1997);
        MusicBand band8 = new MusicBand("Fall Out Boy", 2001);
        MusicBand band9 = new MusicBand("The Weeknd", 2010);
        MusicBand band10 = new MusicBand("Chaos Chaos", 2000);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);
        System.out.println(musicBands);
        Collections.shuffle(musicBands);

        List<MusicBand> musicBands2000 = new ArrayList<>();
        for (MusicBand band : musicBands) {
            if (band.getYear() >= 2000)
                musicBands2000.add(band);
        }
        System.out.println(musicBands2000);
    }
}
