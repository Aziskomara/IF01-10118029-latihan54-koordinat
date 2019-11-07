/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan54.koordinat;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Koordinat
 */
public class warnakoordinat extends koordinat{
    public String namawarna;

    public warnakoordinat(String namawarna, int x, int y) {
        super(x, y);
        System.out.println("Warna koordinat : " + namawarna);
        System.out.println("koordinat sumbu x : " + x +","+ " y : " + y );
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
    
    
}
