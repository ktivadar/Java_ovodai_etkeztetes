package ovoda_beadando_zxcjx6;
/**
 * @author kamti
 * Nev: Kamondy Tivadar
 * Neptun kod: ZXCJX6
 */
public class Teszt{
    Ovoda ovoda;
    Csoport csoport1;
    Csoport csoport2;
    Csoport csoport3;
    Csoport csoport4;

    public Teszt(){
        ovoda = new Ovoda("OvodaNeve", "Gyor, Ovoda utca 15, Magyarorszag" ); //Ovoda neve,cime

        csoport1 = new Csoport("Katica csoport"); //csoportok elnevezese az adott ovodaban
        csoport2 = new Csoport("Pillango csoport");
        csoport3 = new Csoport("Pottyoslabda csoport");
        csoport4 = new Csoport("Maci csoport");

        //Elso csoport
        csoport1.hozzaad(new Gyermek("Pataki Zalan", "Alma", "06204445567",etrend_tipusok.normal));
        csoport1.hozzaad(new Gyermek("Szücs Júlia", "Narancs", "06204445522",etrend_tipusok.liszterzekeny));
        csoport1.hozzaad(new Gyermek("Szűts Ármin", "Citrom", "06304545567",etrend_tipusok.laktoz_erzekeny));
        csoport1.hozzaad(new Gyermek("Szilágyi Dalma", "Annanasz", "06304422567",etrend_tipusok.inzulin_rezisztencia));
        csoport1.hozzaad(new Gyermek("Simon Nándor", "Dinnye", "06206665567",etrend_tipusok.liszterzekeny));
        csoport1.hozzaad(new Gyermek("Boros Ildikó", "Eper", "06204449967",etrend_tipusok.normal));
        csoport1.hozzaad(new Gyermek("Soós Béla", "Ribizli", "06202325567",etrend_tipusok.vegetarianus));
        //csoport1.kivesz("Boros Ildikó"); //kivesszuk az adott gyereket a csoportbol
        ovoda.hozzaad(csoport1); //csoport hozzaadasa az adott ovodahoz

        //Masodik csoport
        csoport2.hozzaad(new Gyermek("Szilágyi Soma", "Toll", "06308739465",etrend_tipusok.normal));
        csoport2.hozzaad(new Gyermek("Péter Barbara", "Ceruza", "06308739464",etrend_tipusok.laktoz_erzekeny));
        csoport2.hozzaad(new Gyermek("Hajdú Csanád", "Radir", "06308739463",etrend_tipusok.inzulin_rezisztencia));
        csoport2.hozzaad(new Gyermek("Zobor Virág", "Vonalzo", "06308739425",etrend_tipusok.normal));
        csoport2.hozzaad(new Gyermek("Szőke Jakab", "Korzo", "06308739415",etrend_tipusok.normal));
        csoport2.hozzaad(new Gyermek("Deák Imre", "Fuzet", "06308739455",etrend_tipusok.vegetarianus));
        ovoda.hozzaad(csoport2);

	//Harmadik csoport
        csoport3.hozzaad(new Gyermek("Király Vivien", "Labda", "06308439465",etrend_tipusok.liszterzekeny));
        csoport3.hozzaad(new Gyermek("Varga Kitti", "Zsiraf", "06308679465",etrend_tipusok.normal));
        csoport3.hozzaad(new Gyermek("Fülöp András", "Kutya", "06308733265",etrend_tipusok.inzulin_rezisztencia));
        csoport3.hozzaad(new Gyermek("Magyar Lili", "Macska", "06308722465",etrend_tipusok.normal));
        csoport3.hozzaad(new Gyermek("Nemes Bertalan", "Madar", "06307779465",etrend_tipusok.liszterzekeny));
        csoport3.hozzaad(new Gyermek("Kis Olivér", "Mokus", "06301112233",etrend_tipusok.normal));
        csoport3.hozzaad(new Gyermek("Apród Hanna", "Krokodil", "06301731465",etrend_tipusok.vegetarianus));
        ovoda.hozzaad(csoport3);


        //Negyedik csoport
        csoport4.hozzaad(new Gyermek("Vörös Arnold", "Nap", "06202439465",etrend_tipusok.normal));
        csoport4.hozzaad(new Gyermek("Fábián Adrián", "Hold", "06208672265",etrend_tipusok.normal));
        csoport4.hozzaad(new Gyermek("Major Anikó", "Csillag", "06208722433",etrend_tipusok.liszterzekeny));
        csoport4.hozzaad(new Gyermek("Szücs Kinga", "Bogre", "06201735465",etrend_tipusok.inzulin_rezisztencia));
        csoport4.hozzaad(new Gyermek("Balla Gabriella", "Csiga", "06201631465",etrend_tipusok.normal));
        csoport4.hozzaad(new Gyermek("Lengyel Blanka", "Katica", "06201731865",etrend_tipusok.laktoz_erzekeny));
        csoport4.hozzaad(new Gyermek("Sándor Márkó", "Lufi", "06201731995",etrend_tipusok.normal));
        ovoda.hozzaad(csoport4);

	//Heti menu beallitasa az ovodaban
        
        ovoda.etelHozzaad(new Etel("Muzli", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),1 ); //utolso parameterrel jeloljuk hogy melyik napra adunk etelt
        ovoda.etelHozzaad(new Etel("Alma", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),1 );
        ovoda.etelHozzaad(new Etel("Kifli", 150,etrend_tipusok.liszterzekeny, napi_etkeztetesek.tizorai),1);
        ovoda.etelHozzaad(new Etel("Paradicsom leves", 400,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),1);
        ovoda.etelHozzaad(new Etel("Rantott sajt", 600,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),1);
        ovoda.etelHozzaad(new Etel("Szendvics", 345,etrend_tipusok.inzulin_rezisztencia, napi_etkeztetesek.uzsonna),1);
        
        ovoda.etelHozzaad(new Etel("Muzli", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),2 );
        ovoda.etelHozzaad(new Etel("Alma", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),2 );
        ovoda.etelHozzaad(new Etel("Kifli", 150,etrend_tipusok.liszterzekeny, napi_etkeztetesek.tizorai),2);
        ovoda.etelHozzaad(new Etel("Paradicsom leves", 400,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),2);
        ovoda.etelHozzaad(new Etel("Rantott sajt", 600,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),2);
        ovoda.etelHozzaad(new Etel("Szendvics", 345,etrend_tipusok.inzulin_rezisztencia, napi_etkeztetesek.uzsonna),2);
        
        ovoda.etelHozzaad(new Etel("Muzli", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),3 );
        ovoda.etelHozzaad(new Etel("Alma", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),3 );
        ovoda.etelHozzaad(new Etel("Kifli", 150,etrend_tipusok.liszterzekeny, napi_etkeztetesek.tizorai),3);
        ovoda.etelHozzaad(new Etel("Paradicsom leves", 400,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),3);
        ovoda.etelHozzaad(new Etel("Rantott sajt", 600,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),3);
        ovoda.etelHozzaad(new Etel("Szendvics", 345,etrend_tipusok.inzulin_rezisztencia, napi_etkeztetesek.uzsonna),3);
        
        ovoda.etelHozzaad(new Etel("Muzli", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),4 );
        ovoda.etelHozzaad(new Etel("Alma", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),4 );
        ovoda.etelHozzaad(new Etel("Kifli", 150,etrend_tipusok.liszterzekeny, napi_etkeztetesek.tizorai),4);
        ovoda.etelHozzaad(new Etel("Paradicsom leves", 400,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),4);
        ovoda.etelHozzaad(new Etel("Rantott sajt", 600,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),4);
        ovoda.etelHozzaad(new Etel("Szendvics", 345,etrend_tipusok.inzulin_rezisztencia, napi_etkeztetesek.uzsonna),4);
        
        ovoda.etelHozzaad(new Etel("Alma", 300 ,etrend_tipusok.normal,napi_etkeztetesek.reggeli),5 );
        ovoda.etelHozzaad(new Etel("Kifli", 150,etrend_tipusok.liszterzekeny, napi_etkeztetesek.tizorai),5);
        ovoda.etelHozzaad(new Etel("Paradicsom leves", 400,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),5);
        ovoda.etelHozzaad(new Etel("Rantott sajt", 600,etrend_tipusok.vegetarianus, napi_etkeztetesek.ebed),5);
        ovoda.etelHozzaad(new Etel("Szendvics", 345,etrend_tipusok.inzulin_rezisztencia, napi_etkeztetesek.uzsonna),5);
        
    }

    public void futtatas(){
        System.out.println("Csoport adatok kiiratasa>>"); //csoport,nevlista kiiratas
        ovoda.AdatokListazasa();

        System.out.println("Heti menu>>"); //heti menu kiiratas
        ovoda.hetiMenu();

        System.out.println("\nKereses>>"); //adott nevu gyermekre kereses
        ovoda.kereses("Szűts Ármin");

        System.out.println("\nLekerdezes parameterezetten>>");
        System.out.println("\tA(z) "+csoport1.getId()+"ban "+ csoport1.etrendIgeny(etrend_tipusok.laktoz_erzekeny)+" db "+etrend_tipusok.laktoz_erzekeny+" etrendet kell kesziteni.");
        System.out.println("\tA(z) "+csoport2.getId()+"ban "+ csoport2.etrendIgeny(etrend_tipusok.normal)+" db "+etrend_tipusok.normal+" etrendet kell kesziteni.");
        System.out.println("\tA(z) "+csoport3.getId()+"ban "+ csoport3.etrendIgeny(etrend_tipusok.vegetarianus)+" db "+etrend_tipusok.vegetarianus+" etrendet kell kesziteni.");
        
        System.out.println("\ntoString metodus tesztelese>>");
        System.out.println("\t"+ovoda.toString());

        System.out.println("\nHeti menu kesz-e teszt>>");
        System.out.println("\t"+ovoda.hetiMenuKesz());
    }


}
