package org.testodev;

enum Gezegen {
    MERKUR(1,"57.000.000 km",4.884,"10,892 km/sa","17 Gün","MERKÜR"),
    VENUS(2,"110.000.000 km",12.346,"9,56 km/sa","243 gün","VENÜS"),
    DUNYA(3,"148.000.000 km",12.709,"5,55 km/sa","24 saat","DÜNYA"),
    MARS(4,"230.000.000 km",6.767,"1,55 km/sa","24 saat","MARS"),
    JUPITER(5,"780.000.000 km",142.647,"14,79 km/sa","9 saat 54 dakika","JÜPİTER"),
    SATURN(6,"1.438.000.000 km",124.309,"87,566 km/sa","10 saat 37 dakika","SATÜRN"),
    URANUS(7,"2.970.000.000 km",51.767 ,"67,76 km/sa","18 saat 23 dakika","URANÜS"),
    NEPTUN(8,"4.568.000.000 km",49.138,"74,52 km/sa","16 saat 28 dakika","NEPTÜN");

    int numara;
    String uzaklik;
    double yariCap;
    String  donmeSuresi;
    String gunUzunlugu;
    String gezegenAdi;

    Gezegen(int numara, String uzaklik, double yariCap, String donmeSuresi, String gunUzunlugu, String gezegenAdi) {
        this.numara=numara;
        this.uzaklik=uzaklik;
        this.yariCap=yariCap;
        this.donmeSuresi=donmeSuresi;
        this.gunUzunlugu=gunUzunlugu;
        this.gezegenAdi=gezegenAdi;
    }
}

public class Main {
    public static void main(String[] args) {

        Gezegen gezegenler = Gezegen.MERKUR;
        gezegenlerBilgi(gezegenler);
    }
    static void gezegenlerBilgi (Gezegen gezegenler)
    {
        String ayrac="----------------------------------------------------------------------------------------------------------------------------------------------------------";
        switch (gezegenler) {
            case MERKUR :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case VENUS :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case DUNYA :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case MARS :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case JUPITER :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case SATURN :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case URANUS :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case NEPTUN :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
        }
    }
}