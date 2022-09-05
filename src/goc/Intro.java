package goc;

public class Intro {
    private String title;
    private String adver;
    private String info;

    public Intro(String title, String adver, String info){
        this.title = title;
        this.adver = adver;
        this.info = info;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAdver(){
        return this.adver;
    }
    public String getInfo(){
        return this.info;
    }
}
