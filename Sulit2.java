import java.util.Scanner;

public class Sulit2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //jumlah elemen array
        System.out.println("Masukkan jumlah elemen array :");
        int n = s.nextInt();

        int [] angka = new int[n];

        System.out.println("Masukkan elemen array :");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemen ke " + (i + 1) + ":");
            angka[i] = s.nextInt();
        }

        int elemenSering = angka[0];
        int jumlahTertinggi = 0;
        boolean sama = true;
        boolean duaElemen = false;

        //
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (angka[i]==angka[j]) {
                    count++;
                }
            }

            if (count>jumlahTertinggi) {
                elemenSering = angka[i];
                jumlahTertinggi = count;
                duaElemen = false;
            } else if (count == jumlahTertinggi && angka[i] != elemenSering) {
                duaElemen = true;
            }

            if (i>0 && count != jumlahTertinggi) {
                sama = false;
            }
        }
        if (sama) {
            System.out.println("Seluruh elemen memiliki total yang sama.");
        } else if (duaElemen) {
            System.out.println("Ada 2 Elemen yang memiliki total yang sama");
        } else {
            System.out.println("Elemen yang sering muncul adalah " + elemenSering + "sebanyak " + jumlahTertinggi + "kali");  
        }
         s.close();
    }
}