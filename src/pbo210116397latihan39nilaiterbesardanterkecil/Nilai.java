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
class Nilai {
    public int nilai[] = new int[20];
    public int max, min;

    public void masukNilaiMahasiswa(int jmlSiswa) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jmlSiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }

    public void tampilNilaiMahasiswa(int jmlSiswa) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jmlSiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }

    public void tampilNilaiTerbesarTerkecil(int jmlSiswa) {
        int i;

        //Inisialisasi Max dan Min
        min = nilai[1];
        max = nilai[1];

        //Penghitungan Nilai Terbesar dan Terkecil
        for (i = 1; i <= jmlSiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}
