package tindall;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game {
    private Player pc;

    public Game(Player p) {
        pc = p;
    }

    public void saveGame() throws FileNotFoundException {
        Gson gson = new Gson();
        String gameJson = gson.toJson(this);
        PrintWriter out = new PrintWriter("game.txt");
        out.println(gameJson);
        out.close();
    }
    static Game loadGame(String filename) {
        Player user = new Player();
        Game gg = new Game(user);
        return gg;
    }
}
