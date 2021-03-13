package com.shapes;

import java.io.Serializable;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Daire extends Sekil implements Serializable {
    private double yaricap;

    final double pi=3.14;

    public Daire(double yaricap){
        this.yaricap = yaricap;
        alanCevreHesapla();
    }

    @Override
    public void alanCevreHesapla() {
        Alan = pi * yaricap * yaricap;
        Cevre = 2 * pi * yaricap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                ", pi=" + pi +
                ", Alan=" + Alan +
                ", Cevre=" + Cevre +
                '}';
    }
}
