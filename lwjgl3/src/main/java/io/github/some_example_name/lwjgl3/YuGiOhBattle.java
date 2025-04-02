package io.github.some_example_name.lwjgl3;

public class YuGiOhBattle {
        public static void main(String[] args) {
            Monster blueEyes = new Monster("Blue-Eyes White Dragon", 3000, 2500);
            Monster darkMagician = new Monster("Dark Magician", 2500, 2100);

            // Blue-Eyes attacks Dark Magician
            blueEyes.attack(darkMagician);
        }
    }
