//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public abstract class Music {
    private String title;
    private String artist;
    private int release_date;

    public Music(String var1, String var2, int var3) {
        this.artist = var2;
        this.release_date = var3;
        this.title = var1;
    }

    public Music(String var1, String var2) {
        this.artist = var2;
        this.title = var1;
    }

    public Music(String var1, int var2) {
        this.title = var1;
        this.release_date = var2;
    }

    public Music(String var1) {
        this.title = var1;
    }

    public Music() {
    }

    public void setArtist(String var1) {
        this.artist = var1;
    }

    public abstract double getDuration();

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getReleaseDate() {
        return this.release_date;
    }
}
