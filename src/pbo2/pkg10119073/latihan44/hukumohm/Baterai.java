package pbo2.pkg10119073.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung hukum ohm
 *
 */

public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai(){
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat pengantar"
                + "\nakan berbanding lurus dengan beda potensial"
                + "\npada ujung-ujung kawat penghantar tersebut"
                + "\nasalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return (float) kuatArus * hambatan;
    }
}