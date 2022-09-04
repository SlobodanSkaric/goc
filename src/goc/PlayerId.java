package goc;

import java.util.Random;

public class PlayerId {
    private String allChar = "qwertzuiopasdfghjklyxcvbnmQWERTZUIOPASDFGHJKLYXCVBNM1234567890/*-+?";
    private String pid ="";
    Random rand = new Random();

    public String getPlayerId(){
        for(int i = 0; i < allChar.length(); i++){
            this.pid += this.allChar.charAt(rand.nextInt(66));
        }

        return this.pid;
    }
}
