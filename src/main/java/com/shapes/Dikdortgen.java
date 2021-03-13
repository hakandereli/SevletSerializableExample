package com.shapes;

import java.io.Serializable;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Dikdortgen extends Sekil implements Serializable {
    public double kenar1;
    public double kenar2;

    public Dikdortgen(double kenar1, double kenar2){
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        alanCevreHesapla();
    }

    @Override
    public void alanCevreHesapla() {
        Alan = kenar1 * kenar2;
        Cevre = 2 * (kenar1 + kenar2);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "kenar1=" + kenar1 +
                ", kenar2=" + kenar2 +
                ", Alan=" + Alan +
                ", Cevre=" + Cevre +
                '}';
    }
}
