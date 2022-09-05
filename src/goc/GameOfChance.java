package goc;

import java.util.Scanner;

public class GameOfChance {
    public static void main(String srgs[]){
        PlayerId pid = new PlayerId();
        Intro intro = new Intro("Hello Welcome in Game","Spnsored", "18+");


        Scanner sc = new Scanner(System.in);

        System.out.println(intro.getTitle() + "\n" + intro.getAdver() + "\n" + intro.getInfo());
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.print("Please enter your name: ");
        String gamerName = sc.nextLine();

        System.out.print("Please enter your bet: ");
        int bet = sc.nextInt();

        Player player = new Player("Slobodan",1000, pid.getPlayerId());

        System.out.println("Ok " + player.getName() + " your amount is " + player.getPayment() + "\nGooo!!!");
    }
}
