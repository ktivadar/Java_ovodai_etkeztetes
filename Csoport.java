package ovoda_beadando_zxcjx6;
import java.util.ArrayList;
import java.util.List;
/**
 * @author kamti
 * Nev: Kamondy Tivadar
 * Neptun kod: ZXCJX6
 */
public class Csoport {
    private String id;
    private List<Gyermek> _gyermekek;

    public Csoport(String id){
        this.id = id;
        _gyermekek = new ArrayList<Gyermek>();
    }

    public boolean hozzaad(Gyermek _gyerek){
        for (Gyermek gyerek : _gyermekek) {
            if(gyerek.getNev() == _gyerek.getNev()){
                return false;
            }
        }

        this._gyermekek.add(_gyerek);
        return true;
    }

    public String getId() {
        return id;
    }

    public boolean kivesz(String nev){
        return this._gyermekek.removeIf(c->{return c.getNev() == nev;});
    }

    public int etrendIgeny(etrend_tipusok etrend){
        return (int)_gyermekek.stream().filter(c->{ return c.getEtrend() == etrend;}).count();
    }

    public Gyermek kereses(String nev){
        return _gyermekek.stream().filter(x->{return x.getNev() == nev;}).findAny().orElse(null);
    }

    public String toString(){
        String str = "";
        str += "\tGyerekek szama a csoportban: "+ _gyermekek.stream().count()+"\n";
        for (Gyermek gyerek : _gyermekek) {
            str += gyerek.toString();
        }

        return str;
    }
}