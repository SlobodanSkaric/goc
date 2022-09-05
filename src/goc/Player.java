package goc;

public class Player {
    private String name;
    private String idPlayer;
    private int payment;

    public Player(String name,  int payment, String pid){
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
        if(this.idPlayer != ""){
            System.out.println(this.name + " your payment is " + this.payment + " " + this.idPlayer);
            return;
        }
        System.out.println("Can not generate player");
    }
}
