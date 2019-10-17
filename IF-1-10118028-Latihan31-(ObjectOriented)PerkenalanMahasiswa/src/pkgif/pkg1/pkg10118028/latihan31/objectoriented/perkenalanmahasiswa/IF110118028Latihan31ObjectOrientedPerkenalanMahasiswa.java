/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan31.objectoriented.perkenalanmahasiswa;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : (Object Oriented) Perkenalan Mahasiswa

 */
public class IF110118028Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10118028");
        mhs1.setNama("Surya Fakhriy Hasbi");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10118029");
        mhs2.setNama("Azis Komara");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10118012");
        mhs3.setNama("Moch Rizki Maulana");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10118009");
        mhs4.setNama("Tassyakur Pasya");
        mhs4.perkenalkanDiri();
    }
    
}
