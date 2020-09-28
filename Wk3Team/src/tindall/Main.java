package tindall;
import com.google.gson.Gson;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setHealth(5);
        player.setGold(5);
        player.setMana(5);
        player.setName("VacationSteve");

        Game game = new Game(player);
        try {
            game.saveGame();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
