import java.util.Scanner;

/**
 * Siakadfor20
 */
public class Siakadfor20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60 ) {
                lulus++;
            } else{
                tidakLulus++;
            }
        }
        System.out.println(" Nilai Tertinggi: " +tertinggi);
        System.out.println("Nilai Terendah: " +terendah);
        System.out.println("Jumlah siswa yang lulus: " +lulus);
        System.out.println("Jumlah siswa yang tidak lulus: " +tidakLulus);
        
    }
}