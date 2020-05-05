package Bakkal;

public abstract class Kisi
{
    private String isim;
    private String tcNo;
    private String sehir;

    public Kisi(String isim, String tcNo, String sehir)
    {
        this.isim = isim;
        this.sehir = sehir;
        this.tcNo = tcNo;
    }

    abstract void pozisyonunuSöyle(); // Bakkal ve Toptanci için farklı olacak.

    public void kabulEdilenParaBirimi() // Bakkal ve Toptanci için Ortak olduğunu Farz ediyoruz.
    {
        System.out.println("Kabul Edilen Para Birimi Türk Lirasıdır.");
    }

    @Override
    public String toString()
    {
        return ("İsim=> "+isim+" TC No=> "+tcNo+" Şehir=> "+sehir);
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
