package tindall;
import com.google.gson.Gson;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Player player = new Player();
        player.setHealth(5);
        player.setGold(5);
        player.setMana(5);
        player.setName("RogueJuan");
        player.addEquipment("Sword", 20);

        Game game = new Game(player);
        try {
            game.saveGame();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Game game2 = game.loadGame("game.txt");
    }
}
