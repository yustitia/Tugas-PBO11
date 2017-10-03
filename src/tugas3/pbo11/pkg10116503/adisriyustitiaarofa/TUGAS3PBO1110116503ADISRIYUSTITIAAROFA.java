/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.pbo11.pkg10116503.adisriyustitiaarofa;

/**
 *
 * @author yustitia arofa
 */
class nilaiMahasiswa {

    String nim;
    String nama;
    char index = 0;
    double quiz , uts , uas;

    void biodataMahasiswa() {

        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + nim + j);
        }

    }

    void HasilBelajar() {
        
        double nQuiz = 0.2 * quiz;
        double nUts = 0.3 * uts;
        double nUas = 0.5 * uas;
        double nilai = nQuiz + nUts + nUas;

        System.out.println("\nQUIZ \t\t= " + quiz);
        System.out.println("UTS \t\t= " + uts);
        System.out.println("UAS \t\t= " + uas);

        System.out.println("\nNilai Akhir \t= " + nilai);

        if (nilai > 80 && nilai <= 100) {
            index = 'A';
        } else if (nilai > 68 && nilai <= 80) {
            index = 'B';
        } else if (nilai > 56 && nilai <= 68) {
            index = 'C';
        } else if (nilai > 45 && nilai <= 56) {
            index = 'D';
        } else if (nilai <= 45) {
            index = 'E';
        }

        switch (index) {
            case 'A':

                System.out.println("\nIndex = " + index);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
        }
    }

}

public class TUGAS3PBO1110116503ADISRIYUSTITIAAROFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilaiMahasiswa mhs1 = new nilaiMahasiswa();
        mhs1.nim = "7.51.15.036.";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs1.biodataMahasiswa();
        
        mhs1.quiz = 50;
        mhs1.uas = 80;
        mhs1.uts = 60;
        mhs1.HasilBelajar();
    }

}
