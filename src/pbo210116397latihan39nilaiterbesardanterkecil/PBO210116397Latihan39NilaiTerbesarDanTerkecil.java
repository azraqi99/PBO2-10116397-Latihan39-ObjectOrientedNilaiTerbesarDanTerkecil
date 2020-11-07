/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Nilai tersebar Dan Terkecil
 */
package pbo210116397latihan39nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nmPetugas;
        int jmlSiswa;

        Nilai value = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        nmPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jmlSiswa = scn.nextInt();
        System.out.println();

        value.masukNilaiMahasiswa(jmlSiswa);
        System.out.println();
        value.tampilNilaiTerbesarTerkecil(jmlSiswa);
        
        System.out.println("Nilai Terbesar : " + value.max);
        System.out.println("Nilai Terkecil : " + value.min);
        System.out.println();
        System.out.println("Nama Petugas : " + nmPetugas);
    }
    
}
