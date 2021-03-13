package com.enums;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public enum EnumSekilTipi {
    Kare("Kare"),
    Dikdortgen("Dikdortgen"),
    Daire("Daire");

    EnumSekilTipi(String sekilTipi) {
        this.sekilTipi = sekilTipi;
    }

    private final String sekilTipi;

    @Override
    public String toString() {
        return this.sekilTipi;
    }
}
