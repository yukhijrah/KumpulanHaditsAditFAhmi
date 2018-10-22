package Fahmi.app.kumpulanhadits.model;

/**
 * Created by wahab on 20/10/18.
 */

public class Doa {

    private int img;
    private String judul;
    private String ayat;
    private String arti;

    public Doa(int img, String judul, String ayat, String arti) {
        this.img = img ;
        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
    }

    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getAyat() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }
}
