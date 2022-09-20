package goc;

import java.util.ArrayList;
import java.util.Random;

public class PlayerLotoChance implements  Chance{
    private ArrayList<Integer> chanceNumber = new ArrayList<Integer>();
    Random rand = new Random();
    private String result = "";
    @Override
    public void chance() {
        int counter = 0;

        while(counter < 7){
            int randomNumber = this.rand.nextInt(1, 36);

            if(!chanceNumber.contains(randomNumber)){
                this.chanceNumber.add(randomNumber);
                counter++;
            }
        }
        if(chanceNumber.size() == 7){
            for(int i = 0; i < chanceNumber.size(); i++){
                this.result += chanceNumber.get(i) + ", ";
            }
            return;
        }

        this.result = "Not set number";

    }

    @Override
    public void reset() {

    }

    @Override
    public String result() {
        return this.result;
    }
}
