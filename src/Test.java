public class Test {
    public static void main(String[] args) {

        Bakkalci bakkal1 = new Bakkalci("Enes","Enes Bakkal","12223","İstanbul",120);
        Bakkalci bakkal2 = new Bakkalci("Engin","Engin Bakkal","1222243","İzmir",140);
        Bakkalci bakkal3 = new Bakkalci("Talha","Talha Bakkal","122323","Ankara",200);

        Toptanci toptanci1 = new Toptanci("Ahmet","122354","İstanbul",4,140);
        Toptanci toptanci2 = new Toptanci("Mehmet","22323","İzmir",2,150);
        Toptanci toptanci3 = new Toptanci("Ayşe","1223543244","İstanbul",1,200);

        System.out.println(bakkal1.toString());
        System.out.println(toptanci1.toString());
        System.out.println("************");
        bakkal1.toplamCalisilanToptanciSayisi();
        bakkal1.pozisyonunuSöyle();
        bakkal1.toptanciEkle(toptanci1);
        bakkal1.toptanciEkle(toptanci2);
        bakkal1.toplamCalisilanToptanciSayisi();
        System.out.println("************");
        toptanci1.bakkalciEkle(bakkal1);
        toptanci1.pozisyonunuSöyle();
        toptanci1.bakkalciEkle(bakkal2);
        toptanci1.toplamCalisilanBakkalSayisi();

        sehirdekiToptancilar istanbulToptancilari = new sehirdekiToptancilar("istanbul");
        istanbulToptancilari.sehirdekiToplamToptanciSayisi();
        istanbulToptancilari.sehireToptanciEkle(toptanci1);
        istanbulToptancilari.sehireToptanciEkle(toptanci2);
        istanbulToptancilari.sehirdekiToplamToptanciSayisi();
        bakkal1.bakkalYasalBelgeleriGoster();
        bakkal3.SatisUcretiHesapla(false,100,10);

    }
}
