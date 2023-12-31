package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Random;

public class PlaythingGet {
    public String file = "toy.txt";

    public String getFile() {
        return file;
    }

    public ArrayList<Plaything> getPlaything() {
        return allPlaythings;
    }

    public ArrayList<Plaything> getPrizeToys() {
        return prizePlaything;
    }

    public String getPrizeFile() {
        return prizeFile;
    }

    private final ArrayList<Plaything> allPlaythings;
    private final ArrayList<Plaything> prizePlaything;
    private final String prizeFile;


    public PlaythingGet() {
        allPlaythings = new ArrayList<Plaything>();
        prizePlaything = new ArrayList<Plaything>();
        Random random = new Random();
        prizeFile = "prize.txt";
    }

    public void addPlaything(Plaything plaything) {
        allPlaythings.add(plaything);

    }
    public int lotereya() throws IOException {
        ArrayList<Double> win = new ArrayList<Double>(allPlaythings.size());
        prizePlaything.clear();
        for (Plaything allPlaything : allPlaythings) {
            double random = Math.random();
            win.add(random * allPlaything.getWeight()*allPlaything.getCount());
        }

        Double max_chance = Collections.max(win);
        System.out.println(win);
        System.out.println(max_chance);
        for (Plaything allPlaything : allPlaythings) {
            if (allPlaything.getId() == win.indexOf(max_chance)) {
                System.out.printf("Выпала игрушка: %s\n", allPlaything.getName());
                FileWriter writer = new FileWriter(prizeFile, true);
                writer.write(allPlaything.getName() + "\n");
                writer.close();


                return allPlaything.getId();
            }
        }
        return 0;
    }

    public void getPrize(int id_plaything) {
        if (allPlaythings.get(id_plaything).getCount() == 0) {
          System.out.println("Игрушки кончились");
          return;
        }
        else {
            allPlaythings.get(id_plaything).setCount(allPlaythings.get(id_plaything).getCount() - 1);

        }
    }

}
