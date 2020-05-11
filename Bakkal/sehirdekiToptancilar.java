import java.util.ArrayList;

public class sehirdekiToptancilar {
    private String sehir;
    private ArrayList<Toptanci> sehirdekiToptancilar;

    public sehirdekiToptancilar(String sehir)
    {
        this.sehir = sehir;
        sehirdekiToptancilar = new ArrayList<>();
    }
    public void sehireToptanciEkle(Toptanci toptanci)
    {
        sehirdekiToptancilar.add(toptanci);
        System.out.println(sehir+" şehrine toptancı başarılı bir şekilde eklendi.");
    }
    public void sehirdenToptanciSil(Toptanci toptanci)
    {
        sehirdekiToptancilar.remove(toptanci);
        System.out.println(sehir+"'de ki toptancı başarılı bir şekilde silindi.");
    }
    public void sehirdekiToplamToptanciSayisi()
    {
        System.out.println(sehir+" güncel toplam toptanci sayisi => "+sehirdekiToptancilar.size());
    }
}
