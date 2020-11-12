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

public class PBO210119073Latihan44HukumOhm {

    public static void main(String[] args) {
        Baterai batre = new Baterai();
        Baterai baterai = new Baterai(3,12);
        
        System.out.println("Kuat Arus : "+baterai.getKuatArus()+" ampere");
        System.out.println("Hambatan  : "+baterai.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+baterai.hitungTegangan()+" volt");
    }
    
}
