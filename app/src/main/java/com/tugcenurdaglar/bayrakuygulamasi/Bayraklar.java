package com.tugcenurdaglar.bayrakuygulamasi;

public class Bayraklar {
    /*bu sınıf ilerleyen derslerde veri tabanı üzerinde çalışırken bize yardımcı
    olacak bir sınıftır. Veri tabanımjızdaki tablomuzu temsil eden bir sınıf olacaktır
    ve içerisnde tablo içindeki alanları temsil eden değişkenlerimiz olacak*/

    private int bayrak_id;
    private  String  bayrak_ad;
    private String bayrak_resim;

    //public class Bayraklar, veri tabanı üzerindeki tablomuzu temsil ediyor
    /*   private int bayrak_id;
    private  String  bayrak_ad;
    private String bayrak_resim;*/

    //bunlar da tablo içindeki alanları temsil ediyor, veri tabanında bu alanlar bu türde


    public Bayraklar() {
    }

    public Bayraklar(int bayrak_id, String bayrak_ad, String bayrak_resim) {
        this.bayrak_id = bayrak_id;
        this.bayrak_ad = bayrak_ad;
        this.bayrak_resim = bayrak_resim;
    }

    public int getBayrak_id() {
        return bayrak_id;
    }

    public void setBayrak_id(int bayrak_id) {
        this.bayrak_id = bayrak_id;
    }

    public String getBayrak_ad() {
        return bayrak_ad;
    }

    public void setBayrak_ad(String bayrak_ad) {
        this.bayrak_ad = bayrak_ad;
    }

    public String getBayrak_resim() {
        return bayrak_resim;
    }

    public void setBayrak_resim(String bayrak_resim) {
        this.bayrak_resim = bayrak_resim;
    }
}
