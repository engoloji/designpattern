import java.util.ArrayList;

public class Bakkalci extends Kisi implements BakkalYasalKosullar {
    //KabulEdilenParaBirimini Burada yazmama gerek kalmadı çünkü extends ettiğim sınıfta bunun ortak kullanılan olduğunu belirttim.
    //Ama bu özelliği Test sınıfımda direkt çağırıp kullanabileceğim. Bu sayede daha az kod yazmış olacağız.
    private int bakkalBuyuklugu;
    private String bakkalAdi;
    private ArrayList<Toptanci> calisilanToptancilar;

    public Bakkalci(String isim,String bakkalAdi, String tcNo, String sehir, int bakkalBuyuklugu)
    {
        super(isim, tcNo, sehir);
        this.bakkalBuyuklugu = bakkalBuyuklugu;
        this.bakkalAdi = bakkalAdi;
        calisilanToptancilar = new ArrayList<>();
    }
    public void SatisUcretiHesapla(boolean dukkanKirami, double malAlim , double karMiktari)
    {
        double totalFiyat=0;
        if (dukkanKirami==true)
        {
            totalFiyat+=malAlim+(((malAlim)*karMiktari)/100);
            System.out.println("Satış Fiyatı = > " + totalFiyat);
        }
        else
        {
            totalFiyat+=malAlim+(((malAlim)*karMiktari+15)/100);
            System.out.println("Satış Fiyatı = > " + totalFiyat);
        }
    }
    @Override
    void pozisyonunuSöyle() //abstract olarak tanımladığım metot.
    {
        System.out.println("Ben bir bakkal sahibiyim.");
    }

    public void toptanciEkle(Toptanci toptanci)
    {
        calisilanToptancilar.add(toptanci);
        System.out.println("Toptancı Bakkalın Listesine eklendi.");
    }

    //Bu 3 metodu interface kullandığım için kullanmak zorundayım.
    @Override
    public boolean satisElemaniBelgesi()
    {
        return true;
    }

    @Override
    public String esnafSicilKaydi()
    {
        return ("Kayitli");
    }

    @Override
    public boolean gidaSatisRuhsati()
    {
        return true;
    }

    public void bakkalYasalBelgeleriGoster()
    {
        System.out.println("Gida Satış Ruhsatı=> "+gidaSatisRuhsati()+ " || Esnaf Sicil Kaydi=> "+esnafSicilKaydi()+" || Satış Elemanı Belgesi=> "+satisElemaniBelgesi());
    }
    public void toplamCalisilanToptanciSayisi()
    {
        System.out.println("Toplam çalışılan bakkal sayısı=> "+calisilanToptancilar.size());
    }

    @Override
    public String toString()
    {
        return (super.toString() +" Bakkal Adı=> "+bakkalAdi+ " || Bakkal Büyüklüğü=> "+bakkalBuyuklugu+"mt Kare.");
    }

    public int getBakkalBuyuklugu() {
        return bakkalBuyuklugu;
    }

    public void setBakkalBuyuklugu(int bakkalBuyuklugu) {
        this.bakkalBuyuklugu = bakkalBuyuklugu;
    }


    public String getBakkalAdi() {
        return bakkalAdi;
    }

    public void setBakkalAdi(String bakkalAdi) {
        this.bakkalAdi = bakkalAdi;
    }


}
