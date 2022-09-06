package goc;

public class Player {
    private String name;
    private PlayerId idPlayer;
    private int payment;

    public Player(String name,  int payment, PlayerId pid){
        this.name = name;
        this.payment = payment;
        this.idPlayer = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void genratePlayer(){
        if(this.idPlayer.getPlayerId() != ""){
            System.out.println("Ok " + this.name + " your payment is " + this.payment + ". Your id is: " + this.idPlayer.getPlayerId());
            return;
        }
        System.out.println("Can not generate player");
    }
}
