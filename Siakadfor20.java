import java.util.Scanner;

/**
 * Siakadfor20
 */
public class Siakadfor20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print89
            ("Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println(" Nilai Tertinggi: " +tertinggi);
        System.out.println("Nilai Terendah: " +terendah);
        
    }
}