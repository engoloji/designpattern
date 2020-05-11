import java.util.ArrayList;

public class Toptanci extends Kisi {

    private int elemanSayisi;
    private int siparisSayisi;
    private ArrayList<Bakkalci> calisilanBakkallar;

    public Toptanci(String isim, String tcNo, String sehir, int elemanSayisi, int siparisSayisi)
    {
        super(isim, tcNo, sehir);
        this.elemanSayisi = elemanSayisi;
        this.siparisSayisi = siparisSayisi;
        calisilanBakkallar = new ArrayList<>();
    }

    @Override
    void pozisyonunuSöyle()
    {
        System.out.println("Ben bir Toptancıyım.");
    }
    public void bakkalciEkle(Bakkalci bakkalci)
    {
        calisilanBakkallar.add(bakkalci);
        System.out.println("Bakkalci Toptancının listesine eklendi.");
    }
    public void toplamCalisilanBakkalSayisi()
    {
        System.out.println("Toplam çalışılan bakkal sayısı=> "+calisilanBakkallar.size());
    }

    @Override
    public String toString() {
        return (super.toString()+" Eleman Sayısı=> "+elemanSayisi+" Sipariş Sayisi=> "+siparisSayisi);
    }

    public int getElemanSayisi() {
        return elemanSayisi;
    }

    public void setElemanSayisi(int elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
    }

    public int getSiparisSayisi() {
        return siparisSayisi;
    }

    public void setSiparisSayisi(int siparisSayisi) {
        this.siparisSayisi = siparisSayisi;
    }
}
