package ovoda_beadando_zxcjx6;
/**
 * @author kamti
 * Nev: Kamondy Tivadar
 * Neptun kod: ZXCJX6
 */
public class Gyermek {
    private String nev;
    private String jel;
    private String telefonszam;
    private etrend_tipusok etrend;

    public Gyermek(String nev, String jel, String telefonszam, etrend_tipusok etrend){
        this.nev = nev;
        this.jel = jel;
        this.telefonszam = telefonszam;
        this.etrend = etrend;
    }

    public Gyermek(String nev, String jel, String telefonszam){
        this.nev = nev;
        this.jel = jel;
        this.telefonszam = telefonszam;
        this.etrend = etrend_tipusok.normal;
    }

    public String getNev() {
        return nev;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public String getJel() {
        return jel;
    }

    public etrend_tipusok getEtrend() {
        return etrend;
    }

    public String toString(){
        return "\t"+nev+"\t"+jel+"\t"+telefonszam+"\t"+etrend+"\n";
    }
}
