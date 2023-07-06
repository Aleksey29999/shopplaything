package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//import static org.example.PlaythingGet.addPlaything;

public class Main {
    public static void main(String[] args) {

        PlaythingGet Play = new PlaythingGet();
        Plaything plaything1 = new Plaything(0, "плюшевый медведь", 2, 30);
        Plaything plaything2 = new Plaything(1, "машинка", 1, 20);
        Plaything plaything3 = new Plaything(2, "кораблик", 4, 35);
        Plaything plaything4 = new Plaything(3, "самолет", 3, 15);

        System.out.println(plaything1);
        System.out.println(plaything2);
        System.out.println(plaything3);
        System.out.println(plaything4);

        Play.addPlaything(plaything1);
        Play.addPlaything(plaything2);
        Play.addPlaything(plaything3);
        Play.addPlaything(plaything4);
        Play.printPlay();

        String continue_flag = "1";
        while (continue_flag.equals("1")) {
            int toy_id = Play.lotereya();
            Play.getPrize(toy_id);
            Play.printPlay();
            System.out.println("Устроим лотерею ещё раз? 1 - да, любой другой символ - нет");
            Scanner in = new Scanner(System.in);
            continue_flag = in.next();
        }
}
}