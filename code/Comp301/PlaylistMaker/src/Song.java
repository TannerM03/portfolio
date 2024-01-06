//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Song extends Music {
    private double _duration;
    private Album _album;
    private String _album_name;

    public Song(String var1, double var2) {
        super(var1);
        this._duration = var2;
    }

    public Song(String var1, double var2, Album var4) {
        super(var1);
        this._album = var4;
        this._duration = var2;
    }

    public Song() {
    }

    public void setAlbum(Album var1) {
        this._album = var1;
    }

    public Album getAlbum() {
        return this._album;
    }

    public void setAlbumName(String var1) {
        this._album_name = var1;
    }

    public String getAlbumName() {
        return this._album_name;
    }

    public double getDuration() {
        return this._duration;
    }

    public String toString() {
        String var10000;
        String var1;
        if (this.getArtist() != null) {
            var10000 = this.getTitle();
            var1 = var10000 + " by " + this.getArtist() + "\nDuration: " + this._duration + " minutes";
        } else {
            var10000 = this.getTitle();
            var1 = var10000 + "\nDuration: " + this._duration + " minutes";
        }

        return var1;
    }
}
