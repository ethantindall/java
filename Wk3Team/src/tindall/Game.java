package tindall;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

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
    static Game loadGame(String filename) throws FileNotFoundException {
        //get from file
        String data= "";
        File file = new File(filename);
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            data += read.nextLine();
        }
        Gson gson = new Gson();
        Player user = gson.fromJson(data, Player.class);
        Game gg = new Game(user);
        return gg;
    }
}
