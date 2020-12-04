package ovoda_beadando_zxcjx6;
import java.util.ArrayList;
import java.util.List;
/**
 * @author kamti
 * Nev: Kamondy Tivadar
 * Neptun kod: ZXCJX6
 */
public class Ovoda {
    private String nev;
    private String cim;
    private List<Csoport> _csoportok;
    private List<Etel> _etelek[];

    public  Ovoda(String nev, String cim){
        this.cim = cim;
        this.nev = nev;
        _csoportok = new ArrayList<Csoport>();
        _etelek = new ArrayList[5];
        for(int i=0;i<5;i++){
            _etelek[i] = new ArrayList<Etel>();
        }
    }

    public void hozzaad(Csoport _csoport){
        _csoportok.add(_csoport);
    }

    public void kivesz(Csoport _csoport){
        _csoportok.remove(_csoport);
    }

    public void etelHozzaad(Etel _etel, int nap){
        _etelek[nap-1].add(_etel);
    }

    public void kereses(String nev){
        for (Csoport csoport: _csoportok) {
            Gyermek gyerek = csoport.kereses(nev);
            if(gyerek != null){
                System.out.println("Sikeres talalat a(z) "+csoport.getId()+"ban: \n"+"Nev: "+gyerek.getNev()+"\nEtrend: "+gyerek.getEtrend());
            }
        }
    }

    public void hetiMenu(){
        for(int i=0;i<5;i++){
            System.out.println("\t-- Nap "+(i+1) +" --");
            for(napi_etkeztetesek etkeztetes :  napi_etkeztetesek.values()){
                System.out.println("\t\t"+etkeztetes+":");
                for (Etel etel : _etelek[i]) {
                    if(etel.getEtkeztetes() == etkeztetes){
                        System.out.println("\t\t\t"+etel.getNev()+"\t"+etel.getEnergia()+" kcal\t"+etel.getEtrend());
                    }
                }
            }
        }
    }

    public String hetiMenuKesz(){
        String str = "";
        for(int i=0;i<5;i++){
            if(_etelek[i].stream().count() <= 0){
                if(str == ""){
                    str = "A heti menu meg nincsen kesz. Nincsen etel az adott nap(ok)on: ";
                }
                str += "Nap "+(i+1)+",";
            }
        }

        if(str != ""){
            return str.substring(0,str.length()-1);
        }

        return "A heti menu kesz. Minden napra van etel az etlapon.";
    }

    public String toString(){
        int rendelesek[] = {0,0,0,0,0};

        for (Csoport csoport: _csoportok) {
            for(int i=0;i<5;i++){
                rendelesek[i] += csoport.etrendIgeny(etrend_tipusok.values()[i]);
            }
        }

        String str = "";
        for(int i=0;i<5;i++){
            str += rendelesek[i]+" "+etrend_tipusok.values()[i]+", ";
        }

        return str;
    }

    public void AdatokListazasa(){
        System.out.println("Csoportok szama az ovodaban: "+_csoportok.stream().count());
        for(Csoport csoport : _csoportok){
            System.out.println("\tCsoport neve: "+csoport.getId());
            System.out.println(csoport.toString());
        }
    }
}
