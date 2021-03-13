package com.shapes;

import java.io.Serializable;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Kare extends Sekil implements Serializable {
    private double kenar;

    public Kare(double kenar){
        this.kenar = kenar;
        alanCevreHesapla();
    }

    @Override
    public void alanCevreHesapla() {
        Alan = kenar * kenar;
        Cevre = 2 * (kenar + kenar);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                ", Alan=" + Alan +
                ", Cevre=" + Cevre +
                '}';
    }
}
