package com.shapes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public abstract class Sekil implements Serializable {
    public double Alan;
    public double Cevre;

    public abstract void alanCevreHesapla();
}
