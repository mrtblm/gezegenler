package org.testodev;

enum Gezegen {
    MERKÜR(1),VENÜS(2),DÜNYA(3),MARS(4),JÜPİTER(5),SATÜRN(6),URANÜS(7),NEPTÜN(8);

    int numara;

    Gezegen(int numara) {
        this.numara=numara;
    }
}

public class Main {
    public static void main(String[] args) {
        
Gezegen gezegenler = Gezegen.NEPTÜN;
        gezegenlerBilgi(gezegenler);
        }
        static void gezegenlerBilgi (Gezegen gezegenler)
        {
            String ayrac="----------------------------------------------------------------------------------------------------------------------------------------------------------";
            switch (gezegenler) {
                case MERKÜR :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: MERKÜR || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 57.000.000 km  || Yarıçapı: 4.884 || Dönme Süresi: 10,892 km/sa || Gün Uzunluğu: 176 gün ");
                    System.out.println(ayrac);
                    break;
                case VENÜS :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: VENÜS   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 110.000.000 km  || Yarıçapı: 12.346 || Dönme Süresi: 9,56 km/sa || Gün Uzunluğu: 243 gün ");
                    System.out.println(ayrac);
                    break;
                case DÜNYA :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: DÜNYA   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 148.000.000 km  || Yarıçapı: 12.709 || Dönme Süresi: 5,55 km/sa || Gün Uzunluğu: 24 saat ");
                    System.out.println(ayrac);
                    break;
                case MARS :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: MARS   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 230.000.000 km  || Yarıçapı: 6.767 || Dönme Süresi: 1,55 km/sa || Gün Uzunluğu: 24 saat ");
                    System.out.println(ayrac);
                    break;
                case JÜPİTER :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: JÜPİTER   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 780.000.000 km  || Yarıçapı: 142.647 || Dönme Süresi: 14,79 km/sa || Gün Uzunluğu: 9 saat 54 dakika ");
                    System.out.println(ayrac);
                    break;
                case SATÜRN :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: SATÜRN   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 1.438.000.000 km  || Yarıçapı: 124.309 || Dönme Süresi: 87,566 km/sa || Gün Uzunluğu: 10 saat 37 dakika ");
                    System.out.println(ayrac);
                    break;
                case URANÜS :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: URANÜS   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 2.970.000.000 km  || Yarıçapı: 51.767 || Dönme Süresi: 67,76 km/sa || Gün Uzunluğu: 18 saat 23 dakika ");
                    System.out.println(ayrac);
                    break;
                case NEPTÜN :
                    System.out.println(ayrac);
                    System.out.println("Gezegen: NEPTÜN   || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: 4.568.000.000 km  || Yarıçapı: 49.138 || Dönme Süresi: 74,52 km/sa || Gün Uzunluğu: 16 saat 28 dakika ");
                    System.out.println(ayrac);
                    break;
            }
        }
    }
