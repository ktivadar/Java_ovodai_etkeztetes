package ovoda_beadando_zxcjx6;
/**
 * @author kamti
 * Nev: Kamondy Tivadar
 * Neptun kod: ZXCJX6
 */
public class Etel {
    private String nev;
    private etrend_tipusok etrend;
    private int energia;
    private napi_etkeztetesek etkeztetes;

    public Etel(String nev, int energia, etrend_tipusok etrend, napi_etkeztetesek etkeztetes){
        this.nev = nev;
        this.energia = energia;
        this.etrend = etrend;
        this.etkeztetes = etkeztetes;
    }
    public etrend_tipusok getEtrend() {
        return etrend;
    }

    public int getEnergia() {
        return energia;
    }

    public String getNev() {
        return nev;
    }

    public napi_etkeztetesek getEtkeztetes(){
        return etkeztetes;
    }
}
